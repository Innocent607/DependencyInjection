# A. Spring Inversion of Control (IoC) and Dependency Injections(DI)
> https://www.baeldung.com/inversion-control-and-dependency-injection-in-spring
> 
Is a fundamental aspect of the Spring framework, through which the Spring container "injects" objects into other objects or "dependencies".

## Inversion of Control
### AKA Object Oriented Programming (OOP)

Is the transfer of control to other objects or portions of a program to a container or framework. 

**e.g**  If we want to add our own behavior, we need to extend the classes of the framework or plugin our own classes.

What comes along is that;
* decoupling the execution of a task from its implementation
* making it easier to switch between different implementations
* greater modularity of a program
* greater ease in testing a program by isolating a component or mocking its dependencies, and allowing components to communicate through contracts

## Dependency Injection
is a pattern we can use to implement IoC. Connecting objects with other objects, or “injecting” objects into other objects.


### 1. Constructor-Based Dependency Injection
@Configuration annotation indicates that the class is a source of bean definitions. 

We use the @Bean annotation on a method to define a bean. If we don't specify a custom name, then the bean name will default to the method name.

> Implemented by class : ConstructorInjectedController
### 2. Setter-Based Dependency Injection
> Implemented by class : SetterInjectedController
### 3. Property-Based Dependency Injection
> Implemented by class : PropertyInjectedController

# B. Spring - Bean Life Cycle
> Further reading: https://howtodoinjava.com/spring-core/spring-bean-life-cycle/

In this Repo we also implemented Bean Life Cycle stages, initialization and destroy call back methods.
They can be instantiated based on Java or XML.

We have;
 * Post-initialization call back methods
 * Pre-destruction call back methods

How do we control **life cycle events**
1. InitializingBean and DisposableBean callback interfaces
2. *Aware interfaces for specific behavior
3. Custom init() and destroy() methods in bean configuration file
4. @PostConstruct and @PreDestroy annotations

> Implemented in class CustomBeanPostProcessor and LifeCycleDemoBean