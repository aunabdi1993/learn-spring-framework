package com.in28minutes.learnspringframework01.game;

public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("Jump");
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
