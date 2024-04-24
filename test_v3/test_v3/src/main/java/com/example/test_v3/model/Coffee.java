package com.example.test_v3.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Coffee {
    private final UUID id;
    private final String type;

    public Coffee(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String type) {
        this.id = id;
        this.type = type;
    }
    public UUID getId(){
        return id;
    }
    public String getType(){
        return type;
    }
}
