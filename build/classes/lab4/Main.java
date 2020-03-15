package lab4;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        VAT tp = new VAT();
        Discount d = new Discount();
        
        double price,Total,a,pricetotal;
        
        System.out.print("ราคาสิ้นค้า: ");
        price = sc.nextInt();
        tp.p = price;
        System.out.println("ภาษี 7 %: "+tp.Tax(tp.p,tp.ta));
        Total  = price+ tp.Tax(tp.p,tp.ta) ;
        System.out.println("ยอดรวม: "+Total);
        
        System.out.print("ส่วนลด%: ");
        a = sc.nextInt();
        d.r = a;
        d.v = Total;
        System.out.println("ลดไป: "+d.Dis(d.v,d.r));
        pricetotal = Total-d.Dis(d.v,d.r);
        System.out.println("ยอดสุทธิ์: "+pricetotal);
    }
  

}
