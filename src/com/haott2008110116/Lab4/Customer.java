package com.haott2008110116.Lab4;

import java.util.Scanner;

public class Customer {
    String Name;
    String Address;
    Scanner scanner = new Scanner(System.in);
    void getName(){
        System.out.print("Nhập tên khách hàng: ");
        Name = scanner.nextLine();
          
    }
 
    void getAddress(){
        System.out.print("Nhâp địa chỉ khách hàng: ");
        Address = scanner.nextLine();
        
    }
     
    void showCustomer(){
        System.out.println(" Name :  "+Name);
        System.out.println(" Address :  "+Address);
    }
}
