package com.haott2008110116.Lab1;

import java.util.Scanner;

public class Lab1Bai4 {
    public static void main(String[] args) {
        //Tính delta và căn delta của PT bậc 2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        System.out.println("Căn delta = " + Math.sqrt(delta));
    }
}
