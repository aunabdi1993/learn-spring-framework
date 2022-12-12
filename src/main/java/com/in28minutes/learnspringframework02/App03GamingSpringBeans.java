package com.in28minutes.learnspringframework02;

import com.in28minutes.learnspringframework02.game.GameRunner;
import com.in28minutes.learnspringframework02.game.GamingConsole;
import com.in28minutes.learnspringframework02.game.PacManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        var game = new PacManGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }


}

public class App03GamingSpringBeans {
    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
