package com.haott2008110116.lab6;

public class Amoeba {
    String sound = "Amoeba.HIF";
    Boolean click;

    int x;
    int y;
    Amoeba(){}
    Amoeba(int xx, int yy){
        x = xx;
        y = yy;
    }
    void xoay(){
        System.out.println("xoay theo toạ độ x: " + x + " và toạ độ y: " + y);
    }
    void playSoud(){
        System.out.println("Âm thanh hình Amoeba: " + sound);
    }   
}
