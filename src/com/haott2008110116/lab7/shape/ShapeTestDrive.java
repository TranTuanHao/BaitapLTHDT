package com.haott2008110116.lab7.shape;

public class ShapeTestDrive {

    public static void main(String[] args) {
        Square hinhVuong = new Square("Hinhvuong.AIF");
        hinhVuong.rotate();
        hinhVuong.playSoud();

        Triangle hinhTamGiac = new Triangle("Hinhtamgiac.AIF");
        hinhTamGiac.rotate();
        hinhTamGiac.playSoud();

        Circle hinhTron = new Circle("Hinhtron.AIF");
        hinhTron.rotate();
        hinhTron.playSoud();

        Amoeba amoeba = new Amoeba("Hinhamoeba.HIF", 5, 10);
        amoeba.rotate();
        amoeba.playSoud();
    }
}
