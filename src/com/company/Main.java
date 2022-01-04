package com.company;

public class Main {

    public static void main(String[] args) {
        Car c = new Car();
        Car c2 = new Car(6,3,"blue");
        Car c3 = new Car(8,4,"red");
        System.out.println("weight =" + c.w + " , hight = " + c.h+ " , color = " + c.cl);
        System.out.println("weight =" + c2.w + " , hight = " + c2.h+ " , color = " + c2.cl);
        System.out.println("weight =" + c3.w + " , hight = " + c3.h + " , color = " + c3.cl);
    }
}
