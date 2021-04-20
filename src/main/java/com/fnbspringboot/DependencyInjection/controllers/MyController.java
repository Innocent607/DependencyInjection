package com.fnbspringboot.DependencyInjection.controllers;

import com.fnbspringboot.DependencyInjection.repositories.GreetingRepository;
import com.fnbspringboot.DependencyInjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    // we refract this controller to accommodate Greeting Service
    /*
        We gonna,
            1. Introduce a greeting variable
            2. and a Constructor
     */
    private GreetingService greetingService;
    private GreetingRepository greetingRepository;


    public MyController(GreetingService greetingService, GreetingRepository greetingRepository) {
        this.greetingService = greetingService;
        this.greetingRepository = greetingRepository;
    }

    // this was our normal controller method we started with
    /*
    public String hello() {
        System.out.println("Hello!");

        return "foo";
    }

     */

    public String hello() {
        System.out.println("Hello!");

        return greetingService.sayGreeting();
    }
}
