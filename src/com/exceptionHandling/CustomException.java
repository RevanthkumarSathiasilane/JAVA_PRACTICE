package com.exceptionHandling;

public class CustomException extends Exception{
    public CustomException(String message) {
        super(message);//calls Main COnstructor inside Exception
    }
}
