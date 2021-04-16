package com.fnbspringboot.DependencyInjection.controllers;

import com.fnbspringboot.DependencyInjection.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    // ****** INSTEAD OF DOING THIS *******//
    /*
    String sayHello(){
        return getGreetingService().sayGreeting();
    }

    public  GreetingServiceImpl getGreetingService(){
        return greetingService;
    }
     */

    //  ******** WE CAN DO THIS  ***********  //
    /*
            and avoid getter
     */
    String sayHello(){
        return greetingService.sayGreeting();
    }
}
