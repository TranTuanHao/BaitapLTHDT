package com.haott2008110116.lab8.keThua;

public class SinhVienIT extends SinhVienGD{
    private Double diemJava;
    private Double diemCss;
    private Double diemHtml;

    public SinhVienIT(String hoTen, Double diemJava, Double diemCss, Double diemHtml){
        super(hoTen, "IT");
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    public Double getDiem() {
        return (2 * diemJava + diemHtml + diemCss) / 4;
    }
}
