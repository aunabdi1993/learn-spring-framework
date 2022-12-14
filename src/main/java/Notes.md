
Lazy Initialization of Spring Beans

    - Default initialization of Spring Beans is eager. This means that the beans are initialized 
    as soon as the application context is loaded.
    - To make the bean initialization lazy, we can use the @Lazy annotation on the bean class or 
    on the bean method.
    - The @Lazy annotation can be used on the bean class or on the bean method.
    - Any errors using lazy will happen during runtime, not during application startup.

Spring Bean Scopes
    
    - Everytime you use @Scope annotation, you are overriding the default scope of the bean.
    - You will see a different hashed value of the bean when you use @Scope annotation.
    - Singleton - Only one instance of the bean is created in the Spring container.
    - Prototype - A new instance of the bean is created every time a request is made for the bean.

Important Spring Annotations

    - @Configuration - Indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime.
    - @Bean - Indicates that a method produces a bean to be managed by the Spring container.
    - @Component - Indicates that an annotated class is a "component". Such classes are considered as candidates for auto-detection when using annotation-based configuration and classpath scanning.
    - @ComponentScan - Enables component-scanning of the specified packages.
    - @Repository - Indicates that an annotated class is a "Repository", originally defined by Domain-Driven Design (Evans, 2003) as "a mechanism for encapsulating storage, retrieval, and search behavior which emulates a collection of objects".
    - @Service - Indicates that an annotated class is a "Service", originally defined by Domain-Driven Design (Evans, 2003) as "an operation offered as an interface that stands alone in the model, with no encapsulated state."
    - @Controller - Indicates that an annotated class is a "Controller", originally defined by the Spring team as "the mechanism by which the user interacts with the system".
    - @Primary - Indicates that a bean should be given preference when multiple candidates are qualified to autowire a single-valued dependency.
    - @Qualifier - Qualifies bean selection for autowiring.
    - @Autowired - Marks a constructor, field, setter method, or config method as to be autowired by Spring's dependency injection facilities.
    - @Value - Indicates that a method parameter should be bound to a URI template variable.
    - @Lazy - Indicates that a bean should be lazily initialized.
    - @Scope - Indicates that a scoped proxy should be created for any bean marked with the @Component annotation, and registered in the application context.
    - @PostConstruct - Indicates that a method should be executed after dependency injection is done to perform any initialization.
    - @PreDestroy - Indicates that a method annotated with @PreDestroy is called just before a bean is being removed by the container.
    - @Named - Indicates that an annotated class is a "Named", originally defined by JSR-330.
    - @Inject - Indicates that a field, method or constructor should be injected with a dependency.


Important Spring Concepts

    - Dependency Injection - Dependency injection is a software design pattern that implements inversion of control for resolving dependencies. It is a technique whereby one object supplies the dependencies of another object. A dependency is an object that can be used (a service).
        - Contructor Injection - The dependencies are provided through a class constructor.
        - Setter Injection - The client exposes a setter method that the injector uses to inject the dependency.
        - Field Injection - The dependency is resolved and injected into fields.
    - Inversion of Control - Inversion of control (IoC) is a design principle in which custom-written portions of a computer program receive the flow of control from a generic framework.
    - Bean Factory - The BeanFactory is the actual container and is responsible for instantiating, configuring, and assembling the beans. The BeanFactory provides ways to configure your application by using XML configuration files.
    - Application Context - The ApplicationContext is a sub-interface of the BeanFactory. It is responsible for providing the configuration information to the BeanFactory. It is also responsible for initializing all the singleton beans.
    - Spring Beans - A Spring bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. Beans are created with the configuration metadata that you supply to the container.
    - Auto Wiring - Auto wiring is the automatic injection of beans dependencies. Spring can automatically wire beans together by using the @Autowired annotation on bean properties.