package com.haott2008110116.lab4;

import java.util.Scanner;

public class Employee {
    String Name;
    String Slary;
    Scanner scanner = new Scanner(System.in);
    void getName(){
        System.out.print("Nhập tên nhân viên: ");
        Name = scanner.nextLine();
        
    }

    void getSalary(){
        System.out.print("Nhập Lương nhân viên: ");
        Slary = scanner.nextLine();
        
    }
    void showEmpoyee(){
        System.out.println("Tên nhân viên: " +Name);
        System.out.println("Lương: " +Slary);
    }
}
