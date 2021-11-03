package com.haott2008110116.lab7.animal;

public class Hippo extends Animal{
    
    public Hippo(String p){
        super(p);
    }

    protected void makeNoise(){
        System.out.println("Hà mã kêu bình thường");
    }
    protected void eat(){
        System.out.println("Hà mã đang ăn cá");
    }
}
