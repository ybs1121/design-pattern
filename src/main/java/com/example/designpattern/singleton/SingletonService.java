package com.example.designpattern.singleton;

public class SingletonService {

    public static SingletonService service = new SingletonService();

    private SingletonService() {}

    private SingletonService getInstance(){
        return service;
    }
}
