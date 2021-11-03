package com.haott2008110116.lab8.lopDoiTuong;

import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private Double donGia;
    private Double giamGia;

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public Double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(Double giamGia) {
        this.giamGia = giamGia;
    }

    public SanPham(){}

    public SanPham(String tenSp, Double donGia, Double giamGia){
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, Double donGia){
        this(tenSp, donGia, 0.0);
    }

    public Double getThueNhapKhau(){
        return donGia * 0.1;

    }

    public void nhap() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm: ");
        tenSp = iScanner.nextLine();
        System.out.println("Nhập giá bán: ");
        donGia = iScanner.nextDouble();
        System.out.println("Nhập giảm giá: ");
        giamGia = iScanner.nextDouble();
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Gía bán: " + donGia + " $");
        System.out.println("Gỉam giá: " + giamGia + " $");
        System.out.println("Thuế nhập khẩu sản phẩm: " + getThueNhapKhau());
    }
}
