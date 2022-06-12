package org.amazon.bhadaur.Services.MessagingService;

public class EmailMessage implements Messages{
    @Override
    public String messageType() {
        return "Email";
    }
}
