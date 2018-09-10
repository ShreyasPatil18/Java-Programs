/*
Write a program to create a Rectangle class, objects and implement method to calculate area of rectangle.
*/

import java.util.*;
class Exp4
{
	int l,b,r;
	int Area(int x,int y)
	{
		l=x;
		b=y;
		return(l*b);
	}
	public static void main(String[] args)
	{
		int x,y;
		Scanner s=new Scanner(System.in);
		Exp4 r=new Exp4();
		System.out.print("Enter Length:");
		x=s.nextInt();
		System.out.print("Enter Breadth:");
		y=s.nextInt();
		System.out.println("Area of Rectangle:"+r.Area(x,y));
	}
}

//OUTPUT

/*
Enter Length:55
Enter Breadth:20
Area of Rectangle:1100
*/