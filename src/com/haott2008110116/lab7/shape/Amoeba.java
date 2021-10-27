package com.haott2008110116.lab7.shape;

public class Amoeba extends Shape{
    private int x;
    private int y;

    Amoeba(String amThanh, int xx, int yy){
        sound = amThanh;
        x = xx;
        y = yy;
    }
    
    protected void rotate(){
        System.out.println("Xoay theo toạ độ x: " + x + " và toạ độ y: " + y);
    }

    protected void playSoud(){
        System.out.println("Phát file âm thanh: " + sound);
    }
}
