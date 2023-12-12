package com.example.designpattern.composite;


import java.util.ArrayList;

//복합
public class Directory extends FileComponent{

    private ArrayList<FileComponent> arrayList = new ArrayList();

    public void add(FileComponent fileComponent){
        arrayList.add(fileComponent);
    }

    @Override
    void print() {
        System.out.println(this);
        for (FileComponent fileComponent : arrayList) {
            fileComponent.print();
        }
    }
}
