package com.haott2008110116.lab3;

import java.util.Arrays;
import java.util.Scanner;


public class Lab3Bai3 {
    public static void main(String[] args) {
        //Viết chương trình thao tác mảng
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Nhập vào giá trị cho phần tử thứ "+ (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        //Sắp xếp và xuất mảng
        System.out.print("Mảng vừa nhập: ");
        for(int i = 0; i < arr.length; i++){
            Arrays.sort(arr);
            System.out.print(arr[i] + " ");
        }
        //Phần tử nhỏ nhất trong mảng
        int min;
        min = arr[0];
        for(int i = 0; i < arr.length; i++)
            min = Math.min(min, arr[i]);
            System.out.println("\n" + "Giá trị nhỏ nhất trong mảng là " + min);

        //Tính trung bình cộng các phần tử chia hết cho 3
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
            if(arr[i] % 3 == 0)
                sum += arr[i];
        float average = sum / arr.length;
           System.out.printf("Trung bình cộng các phần tử chia hết cho 3 là %.2f", average);


    }
}
