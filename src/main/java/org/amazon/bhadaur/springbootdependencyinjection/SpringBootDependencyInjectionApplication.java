package org.amazon.bhadaur.springbootdependencyinjection;

import org.amazon.bhadaur.springbootdependencyinjection.Controller.MySampleController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootDependencyInjectionApplication.class, args);

		/*
		* Getting the type of the application context being generated.
		* The SpringApplication provides an instance of the ApplicationContext
		* */
      		System.out.println(context.getClass().getSimpleName());

		/*
		* Created a controller class with @Controller and asked the
		* application context to provide the instance of that controller
		* */
		MySampleController sampleController = (MySampleController) context.getBean("mySampleController");
		System.out.println(sampleController.sayHello());
	}

}
