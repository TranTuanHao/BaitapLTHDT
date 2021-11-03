package com.haott2008110116.lab8.keThua;

public class SinhVienBiz extends SinhVienGD{
    private Double diemMarketing;
    private Double diemSales;
    
    public SinhVienBiz(String hoTen, Double diemMarketing, Double diemSales){
        super(hoTen, "Kinh tế");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    public Double getDiem(){
        return (2 * diemMarketing + diemSales) / 3;        
    }

    
}
