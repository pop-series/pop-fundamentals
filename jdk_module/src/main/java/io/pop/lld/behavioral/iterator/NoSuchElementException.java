package io.pop.lld.behavioral.iterator;

public class NoSuchElementException extends RuntimeException {
    public NoSuchElementException() {
        super();
    }
    
    public NoSuchElementException(String message) {
        super(message);
    }
}
