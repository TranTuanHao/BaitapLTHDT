package com.haott2008110116.lab5;

public class Xe {
    //attribute
    String TenChuXe;
    String TenXe;
    String HangXe;
    int NamSX;
    String Loai;
    String GiayPhep;
    Double DungTichXang;
    //method
    //constructor
    Xe(String a, String b, String c, int d, String e, String f, Double g){
        TenChuXe = a;
        TenXe = b;
        HangXe = c;
        NamSX = d;
        Loai = e;
        GiayPhep = f;
        DungTichXang = g;
    }
    void showXe(){
        System.out.println("Tên chủ xe: " + TenChuXe);
        System.out.println("Tên xe: " + TenXe);
        System.out.println("Hãng xe: " + HangXe);
        System.out.println("Năm sản xuất: " + NamSX);
        System.out.println("Loại xe: " + Loai);
        System.out.println("Giấy phép xe: " + GiayPhep);
        System.out.println("Dung tích xăng: " + DungTichXang + " lít");
    }

}
