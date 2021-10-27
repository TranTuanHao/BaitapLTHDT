package com.haott2008110116.lab7.animal;

public class AnimalTestDrive {
    
    public static void main(String[] args) {
        Lion suTu = new Lion();
        suTu.makeNoise();
        suTu.roam();

        Tiger Ho = new Tiger();
        Ho.roam();
        Ho.eat();

        Cat meo = new Cat();
        meo.makeNoise();
        meo.eat();
        meo.sleep();

        Hippo haMa = new Hippo();
        haMa.sleep();
        haMa.eat();

        Dog cho = new Dog();
        cho.eat();
        cho.makeNoise();

        Wolf soi = new Wolf();
        soi.makeNoise();
        soi.roam();
        soi.eat();
        soi.sleep();
    }
}
