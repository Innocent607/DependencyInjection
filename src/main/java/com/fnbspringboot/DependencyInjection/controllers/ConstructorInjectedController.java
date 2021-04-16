package com.fnbspringboot.DependencyInjection.controllers;

import com.fnbspringboot.DependencyInjection.services.GreetingServiceImpl;

public class ConstructorInjectedController {
    private GreetingServiceImpl greetingService;

    public ConstructorInjectedController(GreetingServiceImpl greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello() {
        return greetingService.sayGreeting();
    }
}
