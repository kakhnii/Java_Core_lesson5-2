package com.company;

public class Car {
    public int w;
    public int h;
    public String cl;

    Car() {
        w = 5;
        h = 2;
        cl= "white";
    }

    Car(int w, int h) {
        this();
        this.w = w;
        this.h = h;
        this.cl = cl;
    }
    Car(int w, int h, String cl) {
        this();
        this.w=w;
        this.cl = cl;

    }

}


