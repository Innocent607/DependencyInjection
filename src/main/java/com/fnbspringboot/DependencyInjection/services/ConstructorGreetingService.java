package com.fnbspringboot.DependencyInjection.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello.\n I am injected via the constructor!!! \n I'm overriding constructor greeting service. \n Yeeepiii!!!";
    }

}
