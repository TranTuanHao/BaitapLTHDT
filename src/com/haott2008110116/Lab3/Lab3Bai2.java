package com.haott2008110116.Lab3;

public class Lab3Bai2 {
    public static void main(String[] args) {
        //Chương trình xuất bảng cửu chương
        int x = 8;
        for(int i = 1; i <= 9; i++){
            System.out.printf("%d x %d = %d", x, i, x*i);
            System.out.println();
            for(int j = 1; j <= 10; j++){
                System.out.printf("%d x %d = %d", i, j, i*j);
                System.out.println();
            }
        }
    }
}