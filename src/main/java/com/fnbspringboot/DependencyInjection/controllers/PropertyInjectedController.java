package com.fnbspringboot.DependencyInjection.controllers;

import com.fnbspringboot.DependencyInjection.services.GreetingService;
import com.fnbspringboot.DependencyInjection.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired //injector
    //@Qualifier("gettingServiceImpl")
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
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
