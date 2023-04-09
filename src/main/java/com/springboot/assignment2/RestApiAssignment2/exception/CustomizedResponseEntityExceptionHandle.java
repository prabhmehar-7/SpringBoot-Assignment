package com.springboot.assignment2.RestApiAssignment2.exception;

import com.springboot.assignment2.RestApiAssignment2.employee.NoEmployeeFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class CustomizedResponseEntityExceptionHandle extends ResponseEntityExceptionHandler {
    //ResponseEntityExceptionHandler class handles all the Spring MVC Exceptions
    @ExceptionHandler(NoEmployeeFoundException.class)
    public final ResponseEntity<Object> handleNoEmployeeFoundException(Exception ex , WebRequest request){

        ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now() , ex.getMessage() , request.getDescription(false)) ;
        return new ResponseEntity(errorDetails , HttpStatus.BAD_REQUEST) ;
    }

}
