package com.haott2008110116.lab1;

import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args) {
        //Tính thể tích của khối chữ nhật
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cạnh của khối lập phương: ");
        double canh = scanner.nextFloat();
 
        double theTichLP = Math.pow(canh, 3);
 
        System.out.println("Thể tích của khối CN = " + theTichLP);
    }
}
