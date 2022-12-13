package com.in28minutes.learnspringframework02.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
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
