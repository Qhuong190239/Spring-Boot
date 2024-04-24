package com.example.springboot_v8;
import org.springframework.stereotype.Component;

@Component("coffee")
public class Coffee implements CoffeeBeans {

    @Override
    public void makeCoffee() {
        System.out.println("Coffee has been brewed!!");
    }
}
