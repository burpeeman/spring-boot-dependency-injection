package org.amazon.bhadaur.springbootdependencyinjection.Services.MessagingService;

import org.springframework.stereotype.Component;

@Component
public class WhatsAppMessage implements Messages{
    @Override
    public String messageType() {
        return "Message is being sent via whatsApp";
    }
}
