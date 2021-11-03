package com.haott2008110116.lab7.animal;

public class Tiger extends Feline{
    public Tiger(String p){
        super(p);
    }
    protected void makeNoise(){
        System.out.println("Hổ kêu bình thường");
    }
    protected void eat(){
        System.out.println("Hổ đang ăn thịt con mồi");
    }
}
