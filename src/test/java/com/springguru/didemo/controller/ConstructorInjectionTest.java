package com.springguru.didemo.controller;

import com.springguru.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ConstructorInjectionTest {


    private ConstructorInjectionController constructorInjectionController;


    @Before
    public void setUp()
    {
        this.constructorInjectionController = new ConstructorInjectionController(new GreetingServiceImpl());
    }

    @Test
    public void testCode()throws Exception
    {
        assertEquals(GreetingServiceImpl.sayGreeting,constructorInjectionController.sayHello());
    }

}
