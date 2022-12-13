package com.in28minutes.learnspringframework02;

import com.in28minutes.learnspringframework02.game.GameRunner;
import com.in28minutes.learnspringframework02.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.learnspringframework02.game")
public class GamingAppLauncherSpringBeans {
    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (GamingAppLauncherSpringBeans.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}

// @ComponentScan is used to tell Spring where to look for the beans. It is used to tell Spring to scan the
// package and find the relevant beans.

// @Primary Vs @Qualifier: @Primary is used to tell Spring which bean to use when there are multiple beans
// of the same type. @Qualifier is used to tell Spring which bean to use when there are multiple beans of the
// same type and @Primary is not used.

// @Qualifier has higher priority than @Primary.