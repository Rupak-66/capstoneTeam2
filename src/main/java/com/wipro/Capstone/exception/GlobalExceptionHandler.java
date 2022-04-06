package com.wipro.Capstone.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = ConstraintViolationException.class)
    public ResponseEntity<Object> exceptionHandlerConstraintViolation(ConstraintViolationException e){
        return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }

    @ExceptionHandler(value = CustomerNotFoundException.class)
    public ResponseEntity<Object> exceptionHandlerCustomerNotFound(CustomerNotFoundException e){
        Map<String, Object> errorMessage = new LinkedHashMap<>();
        errorMessage.put("timestamp", Instant.now());
        errorMessage.put("error",e.getMessage());
        return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
    }
}
