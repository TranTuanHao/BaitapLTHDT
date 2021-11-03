package com.haott2008110116.lab7.shape;

public class Shape {
    private String sound;

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public Shape(String s){
        sound = s;
    }

    protected void rotate(){
        System.out.println("Xoay 360 độ theo chiều kim đồng hồ");
    }

    protected void playSoud(){
        System.out.println("Phát file âm thanh: " + sound);
    }
}
