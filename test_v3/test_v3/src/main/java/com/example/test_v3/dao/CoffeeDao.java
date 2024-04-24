package com.example.test_v3.dao;

import com.example.test_v3.model.Coffee;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CoffeeDao {
    int insertCoffee(UUID id, Coffee coffee);
    default int insertCoffee(Coffee coffee){
        UUID id = UUID.randomUUID();
        return insertCoffee(id,coffee);
    }

    List<Coffee> selectAllCoffee();
}
