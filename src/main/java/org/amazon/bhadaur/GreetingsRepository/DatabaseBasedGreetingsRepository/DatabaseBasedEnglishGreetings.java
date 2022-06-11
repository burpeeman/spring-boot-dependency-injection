package org.amazon.bhadaur.GreetingsRepository.DatabaseBasedGreetingsRepository;

import org.amazon.bhadaur.GreetingsRepository.EnglishGreetingsRepository;

public class DatabaseBasedEnglishGreetings extends DatabaseBasedGreetings implements EnglishGreetingsRepository {

    public DatabaseBasedEnglishGreetings (){
        super.addGreetings(0, "Hello from database based english greetings service");
        super.addGreetings(1, "Well wishes from database based english greetings service");
    }

    @Override
    public String getGreetings() {
        return super.getGreetings();
    }
}
