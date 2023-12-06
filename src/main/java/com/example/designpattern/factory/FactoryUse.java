package com.example.designpattern.factory;

public class FactoryUse {

    public static void main(String[] args) {
        Factory factory = new CdFactory();
        String system = factory.makeId("System");
        System.out.println(system);
    }
}
