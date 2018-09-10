import  java.util.*;
class Data
{
	double r;
	void getdata()
	{
		System.out.print("Enter Radius: ");
		Scanner sc=new Scanner(System.in);
		r=sc.nextFloat();
	}
}
class Area extends Data
{
	double area;
	void areacalculate()
	{
		area = r*r*3.14;
	}
	void displayarea()
	{
		System.out.println("Area of Circle= "+area);
	}
}
class  Volume extends Area
{
	double v;
	void volumecalculate()
	{
		v=(4*r*r*r*3.14)/3;
	}
	void displayvolume()
	{
		System.out.println("Volume of Sphere= "+v);}
	}
class Exp11
{
 	public static void main(String args[])
 	{
		Volume v = new Volume();
  		v.getdata();
  		v.areacalculate(); 
  		v.displayarea();
  		v.volumecalculate();
  		v.displayvolume();
 	}
} 

//OUTPUT

/*
Enter Radius: 5
Area of Circle= 78.5
Volume of Sphere= 523.3333333333334
*/