package com.haott2008110116.lab6;

public class TestDrive {
    public static void main(String[] args) {
        Square hinhVuong = new Square();
        Circle hinhTron = new Circle();
        Triangle hinhTamGiac = new Triangle();

        hinhVuong.xoay();
        hinhVuong.playSoud();

        hinhTron.xoay();
        hinhTron.playSoud();

        hinhTamGiac.xoay();
        hinhTamGiac.playSoud();
    }
}
