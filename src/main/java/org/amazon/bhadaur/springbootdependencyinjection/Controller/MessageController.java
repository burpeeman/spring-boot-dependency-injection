package org.amazon.bhadaur.springbootdependencyinjection.Controller;

import org.amazon.bhadaur.Services.MessagingService.Messages;
import org.amazon.bhadaur.springbootdependencyinjection.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    private Messages messageType;
    private Message message;

    @Autowired
    public void setMessage(Messages messageType, Message message) {
        this.messageType = messageType;
        this.message = message;
    }

    public String getMessage(){
        return message.getMessage()+" via "+ messageType.messageType();
    }
}
