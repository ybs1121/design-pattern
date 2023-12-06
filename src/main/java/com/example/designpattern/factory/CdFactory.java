package com.example.designpattern.factory;

public class CdFactory extends Factory{
    @Override
    public String makeId(String id) {
        return "CdFactory - " + id;
    }
}
