package com.javatechie.exception;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ErroRepons {
    private HttpStatus status;
    private String message;
    
}
