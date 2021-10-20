package vn.edu.giadinh.tuan06;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.age = 1;

        Dog dog2 = new Dog("Indo", "vàng", 2);

        Dog dog3 = new Dog("China", "Đen", 3);

        dog.ShowDog();
        dog2.ShowDog();
        dog3.ShowDog();

        Dog dog4 = new Dog();
        dog4.bark(2);
    }
}
