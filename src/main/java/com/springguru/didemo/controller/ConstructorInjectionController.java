package com.springguru.didemo.controller;

import com.springguru.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class ConstructorInjectionController {



    private GreetingService greetingService;

    @Autowired
    public ConstructorInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
