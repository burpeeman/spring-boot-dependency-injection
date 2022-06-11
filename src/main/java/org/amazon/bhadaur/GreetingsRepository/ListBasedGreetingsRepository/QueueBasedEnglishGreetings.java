package org.amazon.bhadaur.GreetingsRepository.ListBasedGreetingsRepository;

import org.amazon.bhadaur.GreetingsRepository.EnglishGreetingsRepository;

public class QueueBasedEnglishGreetings extends QueueBasedGreetings implements EnglishGreetingsRepository {

    public QueueBasedEnglishGreetings(){
        super.addGreetings("Hello from queue based english greetings service");
        super.addGreetings("Well wishes from queue based english greetings service");
    }

    @Override
    public String getGreetings() {
        return super.getGreetings();
    }
}
