import  java.util.*;
abstract class Base
{
	protected float r,l,b,area;
	public abstract void calculate();
  	public void display()
  	{ 
		System.out.println("Area="+area);
  	}
}
class Circle extends Base
{
 	public void read(float x)
 	{ 
		r=x;
 	}
 	public void calculate()
 	{ 
		area=3.14f*r*r;
 	}
}
class Rectangle extends Base
{
	public void read(float x,float y)
 	{ 
		l=x; 
		b=y;
 	}
 	public void calculate()
 	{ 
		area=l*b;
 	}
}
class Triangle extends Base
{
 	public void read(float x,float y)
 	{ 
		l=x; 
		b=y;
 	}
 	public void calculate()
 	{ 
		area=0.5f*l*b;
 	}
}
class Exp12
{
 	public static void main(String args[])
 	{
  		float x,y;
 		Scanner sc=new Scanner(System.in);
 		Circle c=new Circle();
 		System.out.println("Circle");
 		System.out.println("Enter the radius: ");
 		x=sc.nextFloat();
 		c.read(x);
 		c.calculate();
 		c.display();
 		Rectangle r=new Rectangle();
 		System.out.println("Rectangle");
 		System.out.println("Enter the Length and Width of a Rectangle: ");
 		x=sc.nextFloat();
 		y=sc.nextFloat();
 		r.read(x,y);
 		r.calculate();
 		r.display();
 		Triangle t=new Triangle();
 		System.out.println("Triangle");
 		System.out.println("Enter the Length and Height of a Triangle: ");
 		x=sc.nextFloat();
 		y=sc.nextFloat();
 		t.read(x,y);
 		t.calculate();
 		t.display();

 	}
}

//OUTPUT
/*
Circle
Enter the radius:
10
Area=314.0
Rectangle
Enter the Length and Width of a Rectangle:
10 20
Area=200.0
Triangle
Enter the Length and Height of a Triangle:
10 20
Area=100.0
*/