package com.haott2008110116.Lab2;

import java.util.Scanner;

public class Lab2Bai4 {
    public static void main(String[] args) {
        int luaChon;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("+---------------------------------------+");
            System.out.println("+       1. Gỉai phương trình bậc 1      +");
            System.out.println("+       2. Gỉai phương trình bậc 2      +");
            System.out.println("+       3. Tính tiền điện               +");
            System.out.println("+       0. Thoát                        +");
            System.out.println("+---------------------------------------+");

            System.out.print("Hãy chọn chức năng: ");
            luaChon = scanner.nextInt();

            switch(luaChon){
                case 0: System.out.println("Bạn đã rời khỏi chương trình!!!"); break;
                case 1: System.out.println("Thực hiện giải phương trình bậc 1");
                        Lab2Bai1.main(args); break;
                case 2: System.out.println("Thực hiện giải phương trình bậc 2");
                        Lab2Bai2.main(args); break;
                case 3: System.out.println("Thực hiện tính tiền điện");
                        Lab2Bai3.main(args); break;
                default: System.out.println("Bạn chọn sai chức năng!!!\nKết thúc chương trình");
            }
        }while(luaChon != 0);    
    }
}
