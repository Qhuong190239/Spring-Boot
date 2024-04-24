package com.example.springboot_v8;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CoffeeShop {
//    @Autowired
    CoffeeBeans coffeeBeans;
//    @Autowired
//    public CoffeeShop(){
//    }
//    @Autowired
    public CoffeeShop(@Qualifier("coffee") CoffeeBeans coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }
//    @Autowired
    public CoffeeBeans getCoffeeBeans() {
        return coffeeBeans;
    }
//    @Autowired
    public void setCoffeeBeans(CoffeeBeans coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }
}

//public class CoffeeShop {
//    private String name;
//    private String location;
//
//    public String getName(){
//        return name;
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//    public String getLocation(){
//        return location;
//    }
//    public void setLocation(String location){
//        this.location = location;
//    }
//    @Override
//    public String toString() {
//        return "This is a coffee shop called " + name + " and it's in " + location;
//    }
//}