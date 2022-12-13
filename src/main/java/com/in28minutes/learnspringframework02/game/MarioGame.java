package com.in28minutes.learnspringframework02.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("Mario Jump");
    }

    public void down() {
        System.out.println("Mario go into hole");
    }

    public void left() {
        System.out.println("Mario go left");
    }

    public void right() {
        System.out.println("Mario accelerate");
    }

}
