package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpringJava {
    public static void main(String[] args) {
        //1: Launch a Spring Context
         var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2: Configure the Spring Context For Spring to Manage
        // Hello World - @Configuration
        // name - @Bean

        //3: Get the Bean from the Spring Context
        System.out.println(context.getBean("name", String.class));
        System.out.println(context.getBean("age", String.class));
        System.out.println(context.getBean("person", Person.class));
        System.out.println(context.getBean("address2", Address.class));
        System.out.println(context.getBean(Person.class));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person5Qualifier", Person.class));

//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
