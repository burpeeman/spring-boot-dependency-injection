package org.amazon.bhadaur.GreetingsRepository.DatabaseBasedGreetingsRepository;

import org.amazon.bhadaur.GreetingsRepository.HindiGreetingsRepository;

public class DatabaseBasedHindiGreetings extends DatabaseBasedGreetings implements HindiGreetingsRepository {

    public DatabaseBasedHindiGreetings (){
        super.addGreetings(0, "Namaste from queue based hindi greetings service");
        super.addGreetings(1, "Well wishes from queue based hindi greetings service");
    }

    @Override
    public String getGreetings() {
        return super.getGreetings();
    }
}
