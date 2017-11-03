package com.springguru.didemo.controller;

import com.springguru.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class PropertyInjectionTest {

    private PropertyBasedInjectionCntroller propertyBasedInjectionCntroller;

    @Before
    public void setUp()throws Exception
    {
        this.propertyBasedInjectionCntroller = new PropertyBasedInjectionCntroller();
        this.propertyBasedInjectionCntroller.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting()
    {
assertEquals(GreetingServiceImpl.sayGreeting,propertyBasedInjectionCntroller.sayHello());

    }
}
