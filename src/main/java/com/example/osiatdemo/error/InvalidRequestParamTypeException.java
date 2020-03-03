package com.example.osiatdemo.error;

public class InvalidRequestParamTypeException extends RuntimeException {
    public InvalidRequestParamTypeException(String id, String message) {
        super(String.format(message + " The request parameter: %s is invalid type, required a number.", id));
    }
}
