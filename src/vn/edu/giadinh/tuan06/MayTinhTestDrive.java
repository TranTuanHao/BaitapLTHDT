package vn.edu.giadinh.tuan06;

public class MayTinhTestDrive {
   public static void main(String[] args) {
       MayTinh mayTinh = new MayTinh();
       int tong1 = mayTinh.tong(5, 10);
       int tong2 = mayTinh.tong(5, 10, 15);
       System.out.println("Tổng 1 = " + tong1);
       System.out.println("Tổng 2 = " + tong2);
   }

}
