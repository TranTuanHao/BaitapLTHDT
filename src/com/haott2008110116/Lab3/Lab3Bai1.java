package com.haott2008110116.Lab3;

import java.util.Scanner;

public class Lab3Bai1 {
    public static void main(String[] args) {
        //Kiểm tra số n có phải là số nguyên tố hay không?
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên tố N: ");
        int N = scanner.nextInt();
        boolean ok = true;
        if(N < 2)
            ok = false;
        else
            for(int i = 2; i < N-1; i++){
                if(N % i == 0){
                    ok = false;
                    break;
                }
                i++;
            }
        if(ok)
            System.out.println(N + " Là số nguyên tố");
        else
            System.out.println(N + " Không phải là số nguyên tố");
    }
}
