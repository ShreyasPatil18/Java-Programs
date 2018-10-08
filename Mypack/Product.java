/* CREATING PACKAGE */
package Mypack;
import java.util.*;
public class Product
{ 
	int ProductID,price,quantity;
  	public void getdata()
 	{ 
		Scanner sc=new Scanner(System.in);
   		System.out.print("Enter Product ID: ");
   		ProductID=sc.nextInt();
   		System.out.print("Enter Product Quantity: ");
   		quantity=sc.nextInt();
		System.out.print("Enter Product Price: ");
   		price=sc.nextInt();
 	}
  
	public void Display()
	{
		System.out.println("\nProduct ID: "+ProductID);
	   	System.out.println("Product Quantity: "+quantity);
   		System.out.println("Product Price: "+price);
	}
}
   
 