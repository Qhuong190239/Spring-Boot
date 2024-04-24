package com.example.restaurantSystem_v7.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Đánh dấu nơi tiếp nhận request từ phía người dùng
@Controller
public class CoffeeController {
    // Đón nhận request GET
    @GetMapping("/")    // Nếu người dùng request tới địa chỉ "/"
    public String homepage(){
        return "homepage";  // Trả về file homepage
    }
    @GetMapping("/new_coffee")
    public String newcoffee(){
        return "newcoffee";
    }
    @GetMapping("/menu")
    public String getAllCoffee(){
        return "coffeeList";
    }

}
