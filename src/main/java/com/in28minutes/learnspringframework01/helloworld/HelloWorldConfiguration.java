package com.in28minutes.learnspringframework01.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};
record Address(String Address, String city) {};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Aun";
    }

    @Bean
    public Integer age() {
        return 29;
    }

    @Bean
    public Person person() {
        var person = new Person("Jub Jub", 50, new Address("123 Main Street", "New York"));
        return person;
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address()); //name, age;
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) {
        return new Person(name, age, address3); //name, age;
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address) {
        return new Person(name, age, address); //name, age;
    }

    @Bean
    public Person person5Qualifier(String name, int age, Address address) {
        return new Person(name, age, address); //name, age;
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("123 Main Street", "New York");
    }

    @Bean(name = "address3")
    @Qualifier("address3Qualifier")
    public Address address3() {
        return new Address("Baker Street", "London");
    }

}


//1: Spring Container vs Spring Context vs IOC Container vs Application Context

// Spring Container - manages Spring beans and their lifecycle. IOC Container is the runtime of the Spring Context
// Which manages the classes. Two types of IOC Containers. BeanFactory and ApplicationContext. Most Enterprise
// Platforms use ApplicationContext.


//2: Java Bean vs Spring Bean

// Java Bean any class that has 3 constraints: 1. Default Constructor 2. Properties using Getters and Setters 3. Implements Serializable
// POJO - Plain Old Java Object: 1. No Constraints 2. Any Java Object is a POJO
// Spring Bean: Any Java object that is managed by Spring.

//3: How to list all beans managed by Spring

// context.getBeanDefinitionNames(); //List all beans managed by Spring
// context.getBeanDefinitionCount(); //Count all beans managed by Spring

//4: What if there are multiple beans of the same class?

// Spring will throw an exception. You can use @Qualifier to specify which bean to use.

//4: Spring is managing objects and Autowiring them, but we are creating the objects?

//