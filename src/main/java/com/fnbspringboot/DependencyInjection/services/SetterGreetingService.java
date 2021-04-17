package com.fnbspringboot.DependencyInjection.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello.\n I am injected via the Setter!!! \n I'm overriding setter greeting service. \n Yeeepiii!!!";
    }
}
