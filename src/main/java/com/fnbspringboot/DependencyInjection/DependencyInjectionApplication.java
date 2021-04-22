package com.fnbspringboot.DependencyInjection;

import com.fnbspringboot.DependencyInjection.controllers.ConstructorInjectedController;
import com.fnbspringboot.DependencyInjection.controllers.MyController;
import com.fnbspringboot.DependencyInjection.controllers.PropertyInjectedController;
import com.fnbspringboot.DependencyInjection.controllers.SetterInjectedController;
import com.fnbspringboot.DependencyInjection.services.PrimaryGreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

		System.out.println("Whatever you see next is executed through my controller");
		System.out.println("Dadada, TadaaaHH!");
		System.out.println("---------------------------------------------------------");

		MyController controller = (MyController) ctx.getBean("myController");

		controller.hello();

		/*
			RUNNING DIFFERENT DEPENDENCY INJECTION INTEGRATIONS
		 */
		System.out.println("Whatever you see next is executed through my IoC and DI");
		System.out.println("Dadada, TadaaaHH!");
		System.out.println("---------------------------------------------------------");
		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}

}
