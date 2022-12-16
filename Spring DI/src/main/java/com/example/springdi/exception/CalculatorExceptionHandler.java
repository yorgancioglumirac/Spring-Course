package com.example.springdi.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CalculatorExceptionHandler {

    @ExceptionHandler
    public CalculatorErrorResponse handleException(CalculatorException exc) {
        CalculatorErrorResponse response = new CalculatorErrorResponse(exc.getMessage(), System.currentTimeMillis());
        return response;
    }

}
