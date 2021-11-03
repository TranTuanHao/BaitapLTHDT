package vn.edu.giadinh.tuan08;

public class Employee extends Person{
    protected int salary;
    public String toString(){
        String s;
        s = name + ", " + birthday;
        s += ", " + salary;
        return s;
    }
}
