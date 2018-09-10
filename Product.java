/* CREATING PACKAGE */
package Mypack;
import java.util.*;
public class Product
{ int ProductID,price;
  String quality;
  public void getdata()
 { Scanner sc=new Scanner(System.in);
   System.out.print("Enter  Product Id=");
   ProductID=sc.nextInt();
   System.out.print("Enter  Product quality=");
   quality=sc.next();
   System.out.print("Enter  Product price=");
   price=sc.nextInt();
 }
  
 public void Display()
 {
   System.out.println("Product Id="+ProductID);
   System.out.println("Product quality="+quality);
   System.out.println("Enter  Product price="+price);
 }
}
   
 