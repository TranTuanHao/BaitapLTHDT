package com.haott2008110116.lab7.animal;

public class Wolf extends Canine{
    public Wolf(String p){
        super(p);
    }
    protected void makeNoise(){
        System.out.println("Chó sói hú.......");
    }
    protected void eat(){
        System.out.println("Chó sói đang ăn thịt con mồi");
    }
} 
