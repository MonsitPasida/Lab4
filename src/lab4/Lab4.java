package lab4;
import java.util.Scanner;
public class Lab4 {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        
        double price,tax,total,discount;

        System.out.print("ราคาสิ้นค้า: ");
        price = sc.nextInt();

        tax = 0.7*price;
        System.out.println("ภาษี 7 %: "+tax);

        System.out.print("ส่วนลด: ");
        discount = sc.nextInt();

        
        total = price - discount ;
        System.out.println("ผลลัพธ์: "+total);
    }

}
