package com.in28minutes.learnspringframework02.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("SuperContra Jump");
    }

    public void down() {
        System.out.println("SuperContra go into hole");
    }

    public void left() {
        System.out.println("SuperContra go left");
    }

    public void right() {
        System.out.println("SuperContra accelerate");
    }
}
