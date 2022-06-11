package org.amazon.bhadaur.springbootdependencyinjection;

import org.amazon.bhadaur.springbootdependencyinjection.Controller.GreetingsController;
import org.amazon.bhadaur.springbootdependencyinjection.Controller.MessageController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"org.amazon.bhadaur.springbootdependencyinjection", "org.amazon.bhadaur.Services", "org.amazon.bhadaur.GreetingsRepository"})
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

		GreetingsController greetingsController = (GreetingsController) context.getBean("greetingsController");
		System.out.println("Getting greetings: " + greetingsController.getGreetings());

		MessageController messageController = (MessageController) context.getBean("messageController");

		System.out.println("and " + messageController.getMessageType());
	}

}
