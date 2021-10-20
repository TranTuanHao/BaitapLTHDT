package vn.edu.giadinh.tuan06;

public class Dog {
    //atribute
    String Breed;//biến state
    String Color;//biến state
    int age;//biến state
    int size;//biến state 
    //method
    //constructor
    Dog(){}
    Dog(String b, String c, Integer a){
        Breed = b;
        Color = c;
        age = a;
    }
    void ShowDog(){
        System.out.println("Giống: " +Breed);
        System.out.println("Màu sắc: "+Color);
        System.out.println("Tuổi: "+age);
    }
    void bark(int num0fbark){
        while(num0fbark > 0){
            System.out.println("RUFF!!!");
            num0fbark--;
        }
    }

    public double getSize(){
        return size;
    }
    public void outPutDog() {
    }
}
