package com.haott2008110116.lab5;

public class Account {
    //atribute
    String Account_Name;
    int Account_Number;
    int Account_Balance;
    //method
    //constructor
    Account(String a, int b, int c){
        Account_Name = a;
        Account_Number = b;
        Account_Balance = c;
    }
    void showAccount(){
        System.out.println("Tên chủ tài khoản: " + Account_Name);
        System.out.println("Số tài khoản: " + Account_Number);
        System.out.println("Số dư tài khoản: " + Account_Balance + " Đồng");
    }
}
