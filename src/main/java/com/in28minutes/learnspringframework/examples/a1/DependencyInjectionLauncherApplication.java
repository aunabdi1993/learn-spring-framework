package com.in28minutes.learnspringframework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//Your Business Class
@Component
class Business {
    Dependency1 dependency1;
    Dependency2 dependency2;

    public Business(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        System.out.println("Constructor Injection");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        System.out.println("setDependency1");
//        this.dependency1 = dependency1;
//    }
//
//
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        System.out.println("setDependency2");
//        this.dependency2 = dependency2;
//    }

    public String toString() {
        return "Using" + dependency1.toString() + "and" + dependency2.toString();
    }

}

@Component
//Dependency1
class Dependency1 {
}

@Component
//Dependency2
class Dependency2 {
}


@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {
    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (DependencyInjectionLauncherApplication.class)) {
        }
    }
}

// @Component - Instance of class implemented by Spring framework - can be used on any class.
// @Bean - Instance of class implemented by Spring framework - can be used on any method.
// Dependency - GamingConsole implements GameRunner. GamingConsole is a dependency of GameRunner.
// @ComponentScan - Spring will scan for @Component and create instances of them.
// Dependency Injection - Spring will inject the dependencies into the class.
// Spring Beans - Object managed by Spring framework.
// Autowiring - Spring will automatically inject the dependencies into the class.