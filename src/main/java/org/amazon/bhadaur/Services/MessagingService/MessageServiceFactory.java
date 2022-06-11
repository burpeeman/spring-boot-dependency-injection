package org.amazon.bhadaur.Services.MessagingService;

public class MessageServiceFactory {

    public Messages getMessageService(String messageType){
        switch(messageType){
            case "email":
              return new EmailMessage();
            case "whatsApp":
                return new WhatsAppMessage();
            default:
                return null;
        }
    }
}
