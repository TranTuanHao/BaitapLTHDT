package com.haott2008110116.kiemtragiuaky;

public class NhanVien extends Nguoi{
    private float heSoLuong;

    public NhanVien(float heSoLuong){
        super("d", "c");
        this.heSoLuong = heSoLuong;
    }

    protected float tinhLuong(){
        if(heSoLuong > 0)
            return heSoLuong * 1500000;
        else
            return 0;
    }

    public String toString(){
        return heSoLuong + " " + tinhLuong();
    }
}
