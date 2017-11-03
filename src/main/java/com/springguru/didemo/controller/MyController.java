package com.springguru.didemo.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String hello()
    {


System.out.println("hello!!!!");
        return "foo";
    }
}
