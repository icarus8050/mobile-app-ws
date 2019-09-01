package com.edu.mobileappws.exceptions;

public class UserServiceException extends RuntimeException {

    private static final long serialVersionUID = 5576254654576893521L;

    public UserServiceException(String message) {
        super(message);
    }
}
