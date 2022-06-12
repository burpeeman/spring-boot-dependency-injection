package org.amazon.bhadaur.springbootdependencyinjection;

public class Message {

    private final String message;

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
