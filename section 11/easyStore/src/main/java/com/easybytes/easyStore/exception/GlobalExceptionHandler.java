package com.easybytes.easyStore.exception;


import com.easybytes.easyStore.controller.LoggingController;
import com.easybytes.easyStore.dto.ErrorResponseDto;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestControllerAdvice
public class GlobalExceptionHandler {
     private static final Logger log = LoggerFactory.getLogger(LoggingController.class);


    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleGlobalException(Exception e , WebRequest webRequest){
        log.error("An exception occurred due to : {} ",e.getMessage());

        ErrorResponseDto errorResponseDto  = new ErrorResponseDto(webRequest.getDescription(false), HttpStatus.INTERNAL_SERVER_ERROR,e.getMessage(), LocalDateTime.now());
        return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponseDto);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>> handleValidationExceptions(MethodArgumentNotValidException exception){
        log.error("An exception occurred due to : {} ",exception.getMessage());
        Map<String ,String> errors = new HashMap<>();
        List<FieldError> fieldErrorList = exception.getBindingResult().getFieldErrors();
        fieldErrorList.forEach(error -> errors.put(error.getField(),error.getDefaultMessage()));
        return ResponseEntity.badRequest().body(errors);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Map<String,String>> handleConstraintViolationExceptions(ConstraintViolationException exception){
        log.error("An exception occurred due to : {} ",exception.getMessage());
        Map<String ,String> errors = new HashMap<>();
        Set<ConstraintViolation<?>> constraintViolationSet = exception.getConstraintViolations();
        constraintViolationSet.forEach(constraintViolation -> errors.put(constraintViolation.getPropertyPath().toString(),constraintViolation.getMessage()));
        return ResponseEntity.badRequest().body(errors);
    }
}
