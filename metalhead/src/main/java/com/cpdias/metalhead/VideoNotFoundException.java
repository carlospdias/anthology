package com.cpdias.metalhead;

public class VideoNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public VideoNotFoundException() {
        super();
    }

    public VideoNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public VideoNotFoundException(String message) {
        super(message);
    }
    
}
