package com.haott2008110116.Lab1;

import java.util.Scanner;

public class Lab1Bai1 {
    public static void main(String[] args) {
        //Xuất họ tên, điểm trung bình
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Điểm TB: ");
        double diemTB = scanner.nextDouble();
        System.out.print(hoTen + " " + diemTB + " Điểm");
        System.out.println(hoTen + " " + diemTB + " Điểm");
        System.out.printf("%s %.2f Điểm", hoTen, diemTB);
    

    }
}
