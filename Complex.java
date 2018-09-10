import java.util.*;
class Complex
{
	int x,y;
	Complex()
	{
		x=0;
		y=0;
	}
	Complex(int real,int img)
	{
		x=real;
		y=img;
	}
	void sum(Complex c1,Complex c2)
	{
		x=c1.x+c2.x;
		y=c1.y+c2.y;
	}
	void display()
	{
		if(y>0)
		{
			System.out.println(x+"+i"+y);
		}
		else
		{
			System.out.println(x);
		}
	}
public static void main(String[] args)
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Real Part:");
	a=sc.nextInt();
	System.out.print("Enter the Imaginary Part:");
	b=sc.nextInt();
	Complex c1=new Complex(a,b);
	System.out.print("Enter the Real Part:");
	a=sc.nextInt();
	System.out.print("Enter the Imaginary Part: ");
	b=sc.nextInt();
	Complex c2=new Complex(a,b);
	Complex c3=new Complex();
	c3.sum(c1,c2);	
	c3.display();
}
}

//OUTPUT

/*
Enter the Real Part:
10
Enter the Imaginary Part:
20
Enter the Real Part:
20
Enter the Imaginary Part
10
30+i30
*/