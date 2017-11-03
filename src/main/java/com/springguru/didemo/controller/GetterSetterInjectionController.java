package com.springguru.didemo.controller;

import com.springguru.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class GetterSetterInjectionController {

    private GreetingService greetingService;

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
