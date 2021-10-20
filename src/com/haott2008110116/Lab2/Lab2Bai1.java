package com.haott2008110116.lab2;

import java.util.Scanner;

public class Lab2Bai1 {
    public static void main(String[] args) {
        //Giaỉ PT Bậc 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phương trình bậc 1 dạng ax + b = 0");
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        if( a == 0 ){
            if( b == 0)
                System.out.println("Phương trình vô số nghiệm");
            else
                System.out.println("Phương trình vô nghiệm");
        }else
            System.out.println("Phương trình có nghiệm x = " + -b/a);
    }
}
