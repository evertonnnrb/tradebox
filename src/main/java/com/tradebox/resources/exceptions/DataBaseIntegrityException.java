package com.tradebox.resources.exceptions;

public class DataBaseIntegrityException extends RuntimeException {


    public DataBaseIntegrityException(String e) {
        super(e);
    }
}
