package com.fnbspringboot.DependencyInjection.controllers;

import com.fnbspringboot.DependencyInjection.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello() {
        return greetingService.sayGreeting();
    }


}
