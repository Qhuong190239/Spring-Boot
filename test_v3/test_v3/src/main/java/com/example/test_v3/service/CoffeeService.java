package com.example.test_v3.service;

import com.example.test_v3.dao.CoffeeDao;
import com.example.test_v3.model.Coffee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeService {
    private final CoffeeDao coffeeDao;

    @Autowired
    public CoffeeService(@Qualifier("another") CoffeeDao coffeeDao){
        this.coffeeDao = coffeeDao;
    }
    public int addCoffee(Coffee coffee){
        return coffeeDao.insertCoffee(coffee);
    }
    public List<Coffee> getAllCoffee(){
        return coffeeDao.selectAllCoffee();
    }
}
