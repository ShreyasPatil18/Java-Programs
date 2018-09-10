/* Define Product class with members Product ID, quantity and price, and methods read and display inside package Mypack. Write a program to import your own package and display the product details */
import Mypack.*;
import java.util.*;
class Exp7
{ public static void main(String args[])
  {   Product p=new Product();
      p.getdata();
      p.Display();
      Welcome w=new Welcome();
      w.Display();
 }
}
   
 