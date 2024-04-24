package com.example.springboot_v8;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootV8Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(
				SpringbootV8Application.class, args);

//		CoffeeBeans coffeeBeans = context.getBean(CoffeeBeans.class);

		CoffeeBeans coffeeBeans = (CoffeeBeans) context.getBean("cappuccino");
		System.out.println(coffeeBeans);
		coffeeBeans.makeCoffee();

		CoffeeShop coffeeShop = context.getBean(CoffeeShop.class);
		System.out.println(coffeeShop);
		System.out.println("Coffee Shop's ingredient: " + coffeeShop.coffeeBeans);
		coffeeShop.coffeeBeans.makeCoffee();

//		System.out.println(context.getBean(CoffeeShop.class));

	}
}
