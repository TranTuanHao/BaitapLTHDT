package com.haott2008110116.lab7.shape;

public class Shape {
    protected String sound;

    protected void rotate(){
        System.out.println("Xoay 360 độ theo chiều kim đồng hồ");
    }

    protected void playSoud(){
        System.out.println("Phát file âm thanh: " + sound);
    }
}
