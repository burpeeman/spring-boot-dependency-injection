package org.amazon.bhadaur.Services.MessagingService;

public class WhatsAppMessage implements Messages{
    @Override
    public String messageType() {
        return "Message is being sent via whatsApp";
    }
}
