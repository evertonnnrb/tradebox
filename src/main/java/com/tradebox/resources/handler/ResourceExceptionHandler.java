package com.tradebox.resources.handler;

import com.tradebox.resources.exceptions.message.StandardError;
import com.tradebox.resources.exceptions.message.ValidationError;
import com.tradebox.resources.exceptions.DataBaseIntegrityException;
import com.tradebox.resources.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> entityNotFound(ResourceNotFoundException e,
                                                        HttpServletRequest req) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError();
        err.setTimestamp(Instant.now());
        err.setStatus(status.value());
        err.setMessage(e.getMessage());
        err.setError("Resource not found");
        err.setPath(req.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(DataBaseIntegrityException.class)
    public ResponseEntity<StandardError> databaseIntegrityViolation(DataBaseIntegrityException e,
                                                                    HttpServletRequest req) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError();
        err.setTimestamp(Instant.now());
        err.setStatus(status.value());
        err.setMessage(e.getMessage());
        err.setError("Database integrity violation");
        err.setPath(req.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<StandardError> methodArgumentoNotValid(MethodArgumentNotValidException e,
                                                                 HttpServletRequest req) {
        HttpStatus status = HttpStatus.UNPROCESSABLE_ENTITY;
        ValidationError err = new ValidationError();
        err.setTimestamp(Instant.now());
        err.setStatus(status.value());
        err.setMessage(e.getMessage());
        for (FieldError fieldError : e.getBindingResult().getFieldErrors()) {
            err.add(fieldError.getField(), fieldError.getDefaultMessage());
        }
        err.setError("Validation exception");
        err.setPath(req.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
