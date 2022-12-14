
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

