package com.example.designpattern.template;

public abstract class AbstractService{

    public abstract void printServiceName();
    public abstract void input();
    public abstract void read();
    public abstract void update();
    public abstract void delete();

    public void oneCycle(){
        printServiceName();
        input();
        read();
        update();
        read();
        delete();
    }


}
