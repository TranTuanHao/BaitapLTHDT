package com.haott2008110116.lab7.shape;

public class Amoeba extends Shape{
    private int x;
    private int y;

    public Amoeba(String s, int x, int y){
        super(s);
        this.x = x;
        this.y = y;
    }
    
    protected void rotate(){
        System.out.println("Xoay theo toạ độ x: " + x + " và toạ độ y: " + y);
    }

    protected void playSoud(){
        System.out.println("Phát file âm thanh: " + getSound());
    }
}
