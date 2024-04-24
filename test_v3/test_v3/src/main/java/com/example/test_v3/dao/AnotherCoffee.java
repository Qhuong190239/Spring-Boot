package com.example.test_v3.dao;

import com.example.test_v3.model.Coffee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Repository("another")
public class AnotherCoffee implements CoffeeDao{

    private static List<Coffee> DB = new ArrayList<>();
    @Override
    public int insertCoffee(UUID id, Coffee coffee){
        DB.add(new Coffee(id, coffee.getType()));
        return 1;
    }

    @Override
    public List<Coffee> selectAllCoffee() {
        return DB;
    }
}
