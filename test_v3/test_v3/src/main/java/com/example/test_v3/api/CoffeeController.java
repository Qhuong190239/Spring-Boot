package com.example.test_v3.api;

import com.example.test_v3.model.Coffee;
import com.example.test_v3.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/coffee")
@RestController
public class CoffeeController {
    private final CoffeeService coffeeService;
    @Autowired
    public CoffeeController(CoffeeService coffeeService){
        this.coffeeService = coffeeService;
    }
    @PostMapping
    public void addCoffee(@RequestBody Coffee coffee){
        coffeeService.addCoffee(coffee);
    }
    @GetMapping
    public List<Coffee> getAllCoffee(){
        return coffeeService.getAllCoffee();
    }
}
