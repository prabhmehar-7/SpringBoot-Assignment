package com.springboot.assignment2.RestApiAssignment2.employee;

public class NoEmployeeFoundException extends RuntimeException{
    public NoEmployeeFoundException(String message){
        super(message) ;
    }
}
