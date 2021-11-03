package com.haott2008110116.lab7.animal;

public class Lion extends Feline{
    public Lion(String p){
        super(p);
    }
    protected void makeNoise(){
        System.out.println("Sử tử kêu bình thường");
    }
    protected void eat(){
        System.out.println("Sử tử đang ăn thịt con mồi");
    }
}
