package org.amazon.bhadaur.GreetingsRepository.ListBasedGreetingsRepository;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public abstract class QueueBasedGreetings {

    protected Deque<String> greetingsQueue;

    String getGreetings(){
        String greetings = greetingsQueue.pollFirst();
        greetingsQueue.addLast(greetings);
        return greetings;
    }

    protected void addGreetings(String greetings){
        if(greetingsQueue==null) greetingsQueue = new ArrayDeque<>();
        greetingsQueue.addLast(greetings);
    }
}
