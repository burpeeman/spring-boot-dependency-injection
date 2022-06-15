package org.amazon.bhadaur.springbootdependencyinjection.JavaBeanConfiguration;

import org.amazon.bhadaur.GreetingsRepository.DatabaseBasedGreetingsRepository.DatabaseBasedEnglishGreetings;
import org.amazon.bhadaur.GreetingsRepository.DatabaseBasedGreetingsRepository.DatabaseBasedHindiGreetings;
import org.amazon.bhadaur.GreetingsRepository.GreetingsRepository;
import org.amazon.bhadaur.GreetingsRepository.ListBasedGreetingsRepository.QueueBasedEnglishGreetings;
import org.amazon.bhadaur.GreetingsRepository.ListBasedGreetingsRepository.QueueBasedHindiGreetings;
import org.amazon.bhadaur.Services.GreetingsService.EnglishGreetings;
import org.amazon.bhadaur.Services.GreetingsService.Greetings;
import org.amazon.bhadaur.Services.GreetingsService.HindiGreetings;
import org.amazon.bhadaur.Services.MessagingService.MessageServiceFactory;
import org.amazon.bhadaur.Services.MessagingService.Messages;
import org.amazon.bhadaur.springbootdependencyinjection.Message;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
public class JavaBeanConfig {

    @Bean
    public Message message(@Value("${bhadaur.message}") String message){
        return new Message(message);
    }

    @Bean("English")
    @Profile("EN-Queue")
    GreetingsRepository queueBasedEnglishGreetings(){
        return new QueueBasedEnglishGreetings();
    }

    @Bean("English")
    @Profile("EN-DB")
    GreetingsRepository databaseBasedEnglishGreetings(){
        return new DatabaseBasedEnglishGreetings();
    }

    @Bean("Hindi")
    @Profile("HI-Queue")
    GreetingsRepository queueBasedHindiGreetings(){
        return new QueueBasedHindiGreetings();
    }

    @Bean("Hindi")
    @Profile("HI-DB")
    GreetingsRepository databaseBasedHindiGreetings(){
        return new DatabaseBasedHindiGreetings();
    }


    @Bean("Greetings")
    @Profile("EN")
    Greetings englishGreetings(@Qualifier("English") GreetingsRepository greetingsRepository){
        return new EnglishGreetings(greetingsRepository);
    }

    @Bean("Greetings")
    @Profile({"HI", "default"})
    Greetings hindiGreetings(@Qualifier("Hindi") GreetingsRepository greetingsRepository){
        return new HindiGreetings(greetingsRepository);
    }

    @Bean
    MessageServiceFactory messageServiceFactory(){
        return new MessageServiceFactory();
    }

    @Bean
    @Primary
    @Profile("EM")
    Messages emailMessage(MessageServiceFactory messageServiceFactory){
        return  messageServiceFactory.getMessageService("email");
    }

    @Bean
    @Profile("WA")
    Messages whatsAppMessage(MessageServiceFactory messageServiceFactory){
        return  messageServiceFactory.getMessageService("whatsApp");
    }
}
