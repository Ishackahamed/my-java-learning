package com.basiccodings.exceptionhandling;

public class CustomException extends Exception {

    // Default constructor
    public CustomException() {
        super("Invalid user details provided");
    }

    // Constructor with a custom message
    public CustomException(String message) {
        super(message);
    }

    // Constructor with a custom message and a cause (for exception chaining)
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
