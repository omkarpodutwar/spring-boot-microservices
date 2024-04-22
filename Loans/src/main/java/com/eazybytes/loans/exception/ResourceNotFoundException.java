package com.eazybytes.loans.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue){
        super(String.format("%s is not found with the given input data %s: '%s'", resourceName, fieldName, fieldValue));
    }
}