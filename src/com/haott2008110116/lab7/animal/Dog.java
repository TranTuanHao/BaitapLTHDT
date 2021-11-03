package com.haott2008110116.lab7.animal;

public class Dog extends Canine{
    public Dog(String p){
        super(p);
    }
    protected void makeNoise(){
        System.out.println("Chó sủa gâu gâu");
    }
    protected void eat(){
        System.out.println("Chó đang ăn thức ăn của chó");
    }
}
