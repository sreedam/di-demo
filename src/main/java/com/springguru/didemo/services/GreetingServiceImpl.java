package com.springguru.didemo.services;


import org.springframework.stereotype.Service;


@Service
public class GreetingServiceImpl implements GreetingService {



    public static final String sayGreeting = "Hi How are you??";


    @Override
    public String sayGreeting() {
        return sayGreeting;
    }
}
