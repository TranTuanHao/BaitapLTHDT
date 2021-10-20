package com.haott2008110116.lab5;

public class Cow {
    //atribute
    double weight;
    //method
    //constructor
    Cow(double a){
        weight = a;
    }
    Cow(){
        double b = 15;
        weight = b;
    }
    void showCow(){
        System.out.println("Cân nặng: " + weight + " Kg");
    }
}
