package com.example.springboot_v8;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cappuccino")
//@Primary
public class Cappuccino implements CoffeeBeans {
    @Override
    public void makeCoffee() {
        System.out.println("Cappuccino has been brewed!!");
    }
}
