package com.springguru.didemo;

import com.springguru.didemo.controller.ConstructorInjectionController;
import com.springguru.didemo.controller.GetterSetterInjectionController;
import com.springguru.didemo.controller.MyController;
import com.springguru.didemo.controller.PropertyBasedInjectionCntroller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

	ApplicationContext applicationContext = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) applicationContext.getBean("myController");
		controller.hello();

		System.out.println(applicationContext.getBean(PropertyBasedInjectionCntroller.class).sayHello());
		System.out.println(applicationContext.getBean(GetterSetterInjectionController.class).sayHello());
		System.out.println(applicationContext.getBean(ConstructorInjectionController.class).sayHello());
	}
}
