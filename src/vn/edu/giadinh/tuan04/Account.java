package vn.edu.giadinh.tuan04;

public class Account {
    public static void main(String[] args) {
        //Attribute - Thuộc tính - Data
        int number_account;
        int number_balance;

        //Method - funcion
        void showData(){
            System.out.println("Number account: " + number_account);
            System.out.println("Number balance: " + number_balance);
        }
    }
    void deposit(int ammount){
        number_balance += ammount;
    }
    void withdraw(int amount){
        number_balance -= amount;
    }
}
