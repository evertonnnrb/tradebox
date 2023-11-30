package com.tradebox.resources.exceptions.message;

import com.tradebox.resources.exceptions.message.FieldMessage;
import com.tradebox.resources.exceptions.message.StandardError;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ValidationError extends StandardError {

    private List<FieldMessage> errorList = new ArrayList<>();

    public void add(String fieldMessage, String  message){
        errorList.add(new FieldMessage(fieldMessage, message));
    }
}
