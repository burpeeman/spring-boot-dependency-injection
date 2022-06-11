package org.amazon.bhadaur.GreetingsRepository.ListBasedGreetingsRepository;

import org.amazon.bhadaur.GreetingsRepository.HindiGreetingsRepository;

public class QueueBasedHindiGreetings extends QueueBasedGreetings implements HindiGreetingsRepository {

    public QueueBasedHindiGreetings(){
        super.addGreetings("Namaste from queue based hindi greetings service");
        super.addGreetings("Well wishes from queue based hindi greetings service");
    }

    @Override
    public String getGreetings() {
        return super.getGreetings();
    }
}
