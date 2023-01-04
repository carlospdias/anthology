package com.cpdias.metalhead;

public class VideoAlreadyExistsException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public VideoAlreadyExistsException() {
        super();
    }

    public VideoAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public VideoAlreadyExistsException(String message) {
        super(message);
    }
    
}
