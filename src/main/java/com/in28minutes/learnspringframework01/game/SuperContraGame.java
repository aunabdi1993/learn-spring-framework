package com.in28minutes.learnspringframework01.game;

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
