package com.example.designpattern.composite;

public class User {

    public static void main(String[] args) {
        Directory root= new Directory();
        Directory d1= new Directory();
        Directory d2= new Directory();
        Directory d3= new Directory();
        Directory d4= new Directory();

        File f1 = new File();
        File f2 = new File();
        File f3 = new File();
        File f4 = new File();
        File f5 = new File();

        root.add(d1);
        root.add(d2);
        root.add(d3);
        root.add(d4);

        root.add(f1);
        d2.add(f2);

        d4.add(f3);
        d4.add(f4);
        d4.add(f5);

        root.print();
    }
}
