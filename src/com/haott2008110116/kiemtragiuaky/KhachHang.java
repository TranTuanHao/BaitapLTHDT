package com.haott2008110116.kiemtragiuaky;

public class KhachHang extends Nguoi{
    private String tenCongTy;
    private double triGiaHoaDon;

    public KhachHang(String tenCongTy, double triGiaHoaDon){
        super("f", "g");
        this.tenCongTy = tenCongTy;
        this.triGiaHoaDon = triGiaHoaDon;
    }

    public String toString(){
        return triGiaHoaDon;
    }
}
