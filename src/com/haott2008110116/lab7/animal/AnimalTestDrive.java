package com.haott2008110116.lab7.animal;

public class AnimalTestDrive {
    
    public static void main(String[] args) {
        Lion suTu = new Lion("Hình ảnh con Sử Tử");
        suTu.makeNoise();
        suTu.roam();

        Tiger Ho = new Tiger("Hình ảnh con Hổ");
        Ho.roam();
        Ho.eat();

        Cat meo = new Cat("Hình ảnh con mèo nguk ngok");
        meo.makeNoise();
        meo.eat();
        meo.sleep();

        Hippo haMa = new Hippo("Hình ảnh con Hà Mã");
        haMa.sleep();
        haMa.eat();

        Dog cho = new Dog("Hình ảnh con ckó ngáo ngơk");
        cho.eat();
        cho.makeNoise();

        Wolf soi = new Wolf("Hình ảnh chú sói tinh nghịch");
        soi.makeNoise();
        soi.roam();
        soi.eat();
        soi.sleep();
    }
}
