package com.tradebox.resources.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String e) {
        super(e);
    }
}
