package com.haott2008110116.Lab1;

import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String[] args) {
        //Tính chu vi, diện tích, cạnh nhỏ nhất của hình chữ nhật
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chiều dài HCN: ");
        float chieuDai = scanner.nextFloat();
        System.out.print("Chiều rộng HCN: ");
        float chieuRong = scanner.nextFloat();

        double chuVi = (chieuDai + chieuRong) * 2;
        double dienTich = chieuDai + chieuRong;
        double min = Math.min(chieuDai, chieuRong);

        System.out.println("Chu vi HCN = " + chuVi);
        System.out.println("Diện tích HCN = " + dienTich);
        System.out.println("Cạnh nhỏ nhất = " + min);
    }
}
