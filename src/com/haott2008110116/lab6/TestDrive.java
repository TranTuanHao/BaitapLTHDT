package com.haott2008110116.lab6;

public class TestDrive {
    public static void main(String[] args) {
        Square hinhVuong = new Square();
        Circle hinhTron = new Circle();
        Triangle hinhTamGiac = new Triangle();
        Amoeba hinhAmoeba = new Amoeba(5, 10);

        hinhVuong.xoay();
        hinhVuong.playSoud();

        hinhTron.xoay();
        hinhTron.playSoud();

        hinhTamGiac.xoay();
        hinhTamGiac.playSoud();

        hinhAmoeba.xoay();
        hinhAmoeba.playSoud();
    }
}
