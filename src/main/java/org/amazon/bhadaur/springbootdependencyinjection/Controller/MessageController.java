package org.amazon.bhadaur.springbootdependencyinjection.Controller;

import org.amazon.bhadaur.Services.MessagingService.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    private Messages message;

    @Autowired
    public void setMessage(Messages message) {
        this.message = message;
    }

    public String getMessageType(){
        return message.messageType();
    }
}
