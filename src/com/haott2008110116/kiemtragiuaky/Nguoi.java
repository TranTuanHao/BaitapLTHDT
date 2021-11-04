package com.haott2008110116.kiemtragiuaky;

public class Nguoi {
    private String hoTen;
    private String diaChi;

    public Nguoi(String hoTen, String diaChi){
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public String toString(){
        return hoTen + " " + diaChi;
    }
}
