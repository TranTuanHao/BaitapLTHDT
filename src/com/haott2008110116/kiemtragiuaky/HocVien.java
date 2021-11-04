package com.haott2008110116.kiemtragiuaky;

public class HocVien extends Nguoi{
    private float diemMonhoc1;
    private float diemMonhoc2;
    private static int soLuongHV;

    public HocVien(float diemMonhoc1, float diemMonhoc2){
        super("a", "b");
        this.diemMonhoc1 = diemMonhoc1;
        this.diemMonhoc2 = diemMonhoc2;
    }

    protected float diemTB(){
        return (diemMonhoc1 + diemMonhoc2) / 2;
    }

    public String toString(){
        return diemMonhoc1 + " " + diemMonhoc2 + " Điểm trung bình môn học: " + diemTB();
    }
}
