package com.haott2008110116.lab8.lopDoiTuong;

public class SanPhamTestDrive {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
        SanPham sp3 = new SanPham("Laptop MSI Katana GF66", 1099.0,  87.0);
        SanPham sp4 = new SanPham("Laptop Acer nitro 5", 924.0);
        
        sp1.nhap();
        sp2.nhap();
        sp1.xuat();
        sp2.xuat();
        sp3.nhap();
        sp3.xuat();
        sp4.nhap();
        sp4.xuat();
    }
}
