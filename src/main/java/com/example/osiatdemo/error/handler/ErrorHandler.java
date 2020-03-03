package com.example.osiatdemo.error.handler;

import com.example.osiatdemo.error.InvalidRequestParamTypeException;
import com.example.osiatdemo.error.UserNotFoundException;
import com.example.osiatdemo.model.APIError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<APIError> handleUserNotFoundException(UserNotFoundException ex) {
        APIError error = new APIError("error-001", ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(InvalidRequestParamTypeException.class)
    public ResponseEntity<APIError> handleInvalidRequestParamTypeException(InvalidRequestParamTypeException ex) {
        APIError error = new APIError("error-002", ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
