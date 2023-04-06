package com.RestFulService1.RestfulService.employee;

//we don't want it to be checked Exception that's why we have extended RuntimeException
public class NoEmployeeFoundException extends RuntimeException{
    public NoEmployeeFoundException(String message){
        super(message) ;
    }
}
