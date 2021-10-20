package com.haott2008110116.lab5;

public class NhanVien {
    //atribute
    String TenNV;
    int Luong;
    String DiaChi;
    String BPLV;//bộ phận làm việc
    String NgaySinh;
    //method
    //constructor
    NhanVien(String a, int b, String c, String d, String e){
        TenNV = a;
        Luong = b;
        DiaChi = c;
        BPLV = d;
        NgaySinh = e;
    }
    void ShowNV(){
        System.out.println("Tên Nhân Viên: " + TenNV);
        System.out.println("Lương: " + Luong + "$");
        System.out.println("Địa chỉ: " + DiaChi);
        System.out.println("BPLV: " + BPLV);
        System.out.println("Ngày sinh: " + NgaySinh);
    }
}
