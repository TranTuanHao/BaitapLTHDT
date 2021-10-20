package com.haott2008110116.lab5;

public class Computer {
    //atribute
    String NhaSX;
    int NamSX;
    String HDH;//Hệ điều hành
    int Ram;
    String CPU;
    int Gia;
    int BH;//Bảo hành
    //method
    //constructor
    Computer(String a, int b, String c, int d, String e, int f, int g){
        NhaSX = a;
        NamSX = b;
        HDH = c;
        Ram = d;
        CPU = e;
        Gia = f;
        BH = g;
    }
    void showComputer(){
        System.out.println("Nhà sản xuất: " + NhaSX);
        System.out.println("Năm sản xuất: " + NamSX);
        System.out.println("Hệ điều hành: " + HDH);
        System.out.println("RAM: " + Ram + "GB");
        System.out.println("CPU: " + CPU);
        System.out.println("Gía bán: " + Gia + "$");
        System.out.println("Bảo hành: " + BH + " tháng");
    }
}
