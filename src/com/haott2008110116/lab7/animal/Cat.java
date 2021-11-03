package com.haott2008110116.lab7.animal;

public class Cat extends Feline{
    public Cat(String p){
        super(p);
    }
    protected void makeNoise(){
        System.out.println("Mèo kêu mèo méo meo mèo meo");
    }
    protected void eat(){
        System.out.println("Mèo đang ăn thức ăn của mèo");
    }
}
