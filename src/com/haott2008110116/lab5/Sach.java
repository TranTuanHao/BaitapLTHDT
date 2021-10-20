package com.haott2008110116.lab5;

public class Sach {
    //atribute
    String TenSach;
    String NhaXB;
    int NamXB;
    double GiaBan;
    int SoLuong;
    String Loai;
    //method
    //constructor
    Sach(){}
    Sach(String a, String b, int c, double d, int e, String f){
        TenSach = a;
        NhaXB = b;
        NamXB = c;
        GiaBan = d;
        SoLuong = e;
        Loai = f;
    }
    void outPutSach(){
        System.out.println("Tên sách: " + TenSach);
        System.out.println("Nhà xuất bản: " + NhaXB);
        System.out.println("Năm xuất bản: " + NamXB);
        System.out.println("Gía bán: " + GiaBan);
        System.out.println("Số lượng: " + SoLuong);
        System.out.println("Loại: " + Loai);
    }

}
