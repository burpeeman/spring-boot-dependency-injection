package org.amazon.bhadaur.springbootdependencyinjection.Services.MessagingService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailMessage implements Messages{
    @Override
    public String messageType() {
        return "Message is being send via email";
    }
}
