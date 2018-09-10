/* Write a program to implement method overloading to calculate area of rectangle, square and circle. */

import java.util.*;
class Area
{
int l,b;
float r;
	float Area(float x)
	{
		r=x;
		return(3.14f*r*r);
	}
	int Area(int x)
	{
		l=x;
		return(l*l);
	}
	int Area(int x,int y)
	{
		l=x;
		b=y;
		return(l*b);
	}
}
class Exp6
{
public static void main(String[] args)
{
	int x,y,ch,r; 
	String choice=""; 
	float radius;
    	Scanner sc=new Scanner(System.in);
    	Area a=new Area();
	do
   	{ 
  		System.out.println("1. Area of Rectangle");
		System.out.println("2. Area of Square");
		System.out.println("3. Area of Circle");
		System.out.println("Enter Your Choice");
		ch=sc.nextInt();
		switch(ch)
    		{   
			case 1: 
				System.out.println("Enter Length and Breadth of Rectangle");
                   		x=sc.nextInt();	
				y=sc.nextInt(); 
                   		System.out.println("Area of Rectangle="+a.Area(x,y));
                   		break;

		        case 2:  
				System.out.println("Enter Side of Square");
                   		x=sc.nextInt();
                   		System.out.println("Area of Square="+a.Area(x));
                   		break;
                 		
        		case 3:  
				System.out.println("Enter Radius of Circle");
                   		radius=sc.nextFloat();
		                System.out.println("Area of circle="+a.Area(radius));        		   
				break;
			default: 
				System.out.println("Invalid choice");
				break;        
		}
				System.out.println("Do you want to continue(Y/N)??");
    				choice=sc.next();
    	}while(choice.equals("y")||choice.equals("Y"));
		
}
}