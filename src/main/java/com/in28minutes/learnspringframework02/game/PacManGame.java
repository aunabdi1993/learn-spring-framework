package com.in28minutes.learnspringframework02.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole {

        public void up() {
            System.out.println("PacMan go up");
        }

        public void down() {
            System.out.println("PacMan go down");
        }

        public void left() {
            System.out.println("PacMan go left");
        }

        public void right() {
            System.out.println("PacMan go right");
        }

}

// Component can be used to mark a class as a bean without using the Bean annotation. We need to tell Spring
// where to look for this Bean.