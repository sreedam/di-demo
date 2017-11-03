package com.springguru.didemo.controller;

import com.springguru.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class PropertyBasedInjectionCntroller {


    @Autowired
    public GreetingServiceImpl greetingService;
//This is not to do


    public String sayHello()
    {
        return greetingService.sayGreeting();
    }


}
