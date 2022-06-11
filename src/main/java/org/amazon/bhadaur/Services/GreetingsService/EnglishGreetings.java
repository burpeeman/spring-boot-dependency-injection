package org.amazon.bhadaur.Services.GreetingsService;

import org.amazon.bhadaur.GreetingsRepository.GreetingsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EnglishGreetings implements Greetings {


    private final GreetingsRepository greetingsRepository;

    public EnglishGreetings(GreetingsRepository greetingsRepository){
        this.greetingsRepository = greetingsRepository;
    }

    @Override
    public String greet() {
        return greetingsRepository.getGreetings();
    }
}
