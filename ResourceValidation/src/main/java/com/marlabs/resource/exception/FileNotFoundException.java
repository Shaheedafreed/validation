package com.marlabs.resource.exception;

public class FileNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1 ;

    public FileNotFoundException(String message) {
        super(message);
    }

    public FileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
