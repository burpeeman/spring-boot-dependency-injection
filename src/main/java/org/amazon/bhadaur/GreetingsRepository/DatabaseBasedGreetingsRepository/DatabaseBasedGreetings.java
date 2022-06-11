package org.amazon.bhadaur.GreetingsRepository.DatabaseBasedGreetingsRepository;

public abstract class DatabaseBasedGreetings {

    protected String[] greetingsDatabase = new String[10];

    String getGreetings(){
        return greetingsDatabase[0];
    }

    protected void addGreetings(int index, String greetings){
       greetingsDatabase[index] = greetings;
    }
}
