package com.example.designpattern.composite;

//단일
public class File extends FileComponent{
    @Override
    void print() {
        System.out.println(this);
    }
}
