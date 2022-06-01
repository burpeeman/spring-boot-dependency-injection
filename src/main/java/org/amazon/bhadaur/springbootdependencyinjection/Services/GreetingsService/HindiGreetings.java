package org.amazon.bhadaur.springbootdependencyinjection.Services.GreetingsService;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("Greetings")
@Profile({"HI", "default"})
public class HindiGreetings implements Greetings{
    @Override
    public String greet() {
        return "Greetings in Hindi";
    }
}
