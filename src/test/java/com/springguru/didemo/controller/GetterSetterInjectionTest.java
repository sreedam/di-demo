package com.springguru.didemo.controller;

import com.springguru.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetterSetterInjectionTest {

    private GetterSetterInjectionController getterSetterInjectionController;

    @Before
    public void setUp()
    {
    this.getterSetterInjectionController  = new GetterSetterInjectionController();
    this.getterSetterInjectionController.setGreetingService(new GreetingServiceImpl());

    }

    @Test
    public void testGreeting() throws Exception
    {
        assertEquals(GreetingServiceImpl.sayGreeting,getterSetterInjectionController.sayHello());
    }
}
