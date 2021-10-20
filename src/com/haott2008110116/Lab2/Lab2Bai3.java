package com.haott2008110116.lab2;

import java.util.Scanner;

public class Lab2Bai3 {
    public static void main(String[] args) {
        //Tính tiền điện
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điện sử dụng của tháng: ");
        int soDien = scanner.nextInt();
        double tien;
        if(soDien <= 50 && soDien > 0)
            tien = soDien * 1000;
        else
            tien = 50 * 1000 + (soDien - 50) * 1200;
        
        System.out.println("Tiền điện của tháng này: " +tien);
        
            
    }
}
