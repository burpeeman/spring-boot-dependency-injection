package org.amazon.bhadaur.Services.MessagingService;

public class EmailMessage implements Messages{
    @Override
    public String messageType() {
        return "Message is being send via email";
    }
}
