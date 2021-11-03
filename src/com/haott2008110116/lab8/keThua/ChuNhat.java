package com.haott2008110116.lab8.keThua;

public class ChuNhat {
    protected Double rong;
    protected Double dai;

    public ChuNhat(Double dai, Double rong){
        this.dai = dai;
        this.rong = rong;
    }

    protected Double getChuVi(){
        return (dai + rong) * 2;
    }
    
    protected Double getDienTich(){
        return dai * rong;
    }

    protected void xuat(){
        System.out.println("Chiều dài của hình chữ nhật: " + dai);
        System.out.println("Chiều rộng của hình chữ nhật: " + rong);
        System.out.println("Diện tích của hình chữ nhật: " + getDienTich());
        System.out.println("Chu vi của hình chữ nhật: " + getChuVi());
    }
}
