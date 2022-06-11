package org.amazon.bhadaur.Services.GreetingsService;

import org.amazon.bhadaur.GreetingsRepository.GreetingsRepository;

public class HindiGreetings implements Greetings{

    private final GreetingsRepository greetingsRepository;

    public HindiGreetings(GreetingsRepository greetingsRepository){
        this.greetingsRepository = greetingsRepository;
    }

    @Override
    public String greet() {
        return greetingsRepository.getGreetings();
    }
}
