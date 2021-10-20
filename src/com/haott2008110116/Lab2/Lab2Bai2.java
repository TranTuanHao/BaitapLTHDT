package com.haott2008110116.lab2;

import java.util.Scanner;

public class Lab2Bai2 {
    public static void GiaiPTBac1(double a, double b){
        if( a == 0 ){
            if( b == 0)
                System.out.println("Phương trình vô số nghiệm");
            else
                System.out.println("Phương trình vô nghiệm");
        }else
            System.out.println("Phương trình có nghiệm x = " + -b/a);
    }
    public static void GiaiPTBac2(double a, double b, double c){
        double delta = Math.pow(b, 2) - 4 * a * c;
        if(delta < 0)
            System.out.println("Phương trình vô nghiệm");
        else if(delta == 0){
            System.out.println("Phương trình có nghiệm kép x = " + -b/(2*a));
        }
        else{
            System.out.println("Phương trình có hai nghiệm phân biệt");
            double x1 = (-b + Math.sqrt(delta) / (2*a));
            double x2 = (-b - Math.sqrt(delta) / (2*a));
            System.out.println("Nghiệm x1 = " + x1);
            System.out.println("Nghiệm x2 = " + x2);
        }
    }
    public static void main(String[] args) {
        //Gỉai PT bậc 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phương trình bậc 2 dạng ax^2 + b + c = 0");
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        if(a == 0)
            GiaiPTBac1(b, c);
        else
            GiaiPTBac2(a, b, c);
        
    }
}
