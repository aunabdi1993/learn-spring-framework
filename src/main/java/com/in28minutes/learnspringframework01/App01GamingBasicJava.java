package com.in28minutes.learnspringframework01;

import com.in28minutes.learnspringframework01.game.GameRunner;
import com.in28minutes.learnspringframework01.game.PacManGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {

        var game = new PacManGame(); //1: Object Creation
//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
            //2: Object Creation + Wiring of Dependencies
            // Game is a dependency of GameRunner
        gameRunner.run();

    }
}
