package org.amazon.bhadaur.springbootdependencyinjection.Controller;

import org.amazon.bhadaur.Services.GreetingsService.Greetings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingsController {

    private final Greetings greetings;

    @Autowired
    public GreetingsController(Greetings greetings){
        this.greetings = greetings;
    }

    public String getGreetings(){
        return greetings.greet();
    }
}
