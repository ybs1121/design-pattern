package com.example.designpattern.template;

public class TestController extends AbstractService{

    private Integer i;

    @Override
    public void printServiceName() {
        System.out.println("TestService");
        oneCycle();
    }

    @Override
    public void input() {
        i = 1;
    }

    @Override
    public void read() {
        System.out.println(i);
    }

    @Override
    public void update() {
        i = 2;
    }

    @Override
    public void delete() {
        i = null;
    }
}
