package com.haott2008110116.lab8.keThua;

public class Vuong extends ChuNhat{
    public Vuong(double canh){
        super(canh, canh);
    }

    protected void xuat() {
        System.out.println("Cạnh của hình vuông: "+ dai);
        System.out.println("Diện tích của hình vuông: "+ getDienTich());
        System.out.println("Chu vi của hình vuông: "+ getChuVi());
    }
}
