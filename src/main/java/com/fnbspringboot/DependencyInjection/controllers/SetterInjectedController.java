package com.fnbspringboot.DependencyInjection.controllers;

import com.fnbspringboot.DependencyInjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    @Autowired
    /*
        SIMILARLY

        Since we're showing different injection integrations, the APPLICATION
        was angry:

        Action: //suggested action to take is below

            Consider marking one of the beans as @Primary, updating the consumer
            to accept multiple beans, or using @Qualifier to identify the bean
            that should be consumed
     */
    @Qualifier("setterGreetingService")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }


}
