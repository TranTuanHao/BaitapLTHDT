package com.haott2008110116.lab8.keThua;

public abstract class SinhVienGD {
    private String hoTen, nganh;

    public String getHoTen() {
        return hoTen;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }
    
    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public SinhVienGD(String hoTen, String nganh){
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract Double getDiem();

    public String getHocLuc(){
        if(getDiem() < 5)
            System.out.println("Học lực yếu");
        else if(5 <= getDiem() && getDiem() < 6.5)
            System.out.println("Học lực trung bình");
        else if(6.5 <= getDiem() && getDiem() <7.5)
            System.out.println("Học lực khá");
        else if(7.5 <= getDiem() && getDiem() < 9)
            System.out.println("Học lực giỏi");
        else
            System.out.println("Học lực xuất sắc");
        return getHocLuc();
    }

    public void xuat(){
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Ngành: " + nganh);
        System.out.println("Học lực: " + getHocLuc());
    }
}
