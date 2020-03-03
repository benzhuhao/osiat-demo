package com.example.osiatdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class APIError {
    private String errorCode;
    private String errorMessage;

}
