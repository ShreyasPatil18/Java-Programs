import java.util.*;
class Student
{     
	int roll_no;
      	void get_number(int n)
	{    
		roll_no=n;
	}
	void put_number()
	{
		System.out.println("Roll No: "+roll_no);
	}
}
class Test extends Student
{ 
	float sem1,sem2;
     	void get_marks(float m1,float m2)
     	{  
		sem1=m1; 
	        sem2=m2;
     	}
	void put_marks()
	{
		System.out.println("Marks Obtained in Sem-1: "+sem1);
		System.out.println("Marks Obtained in Sem-2: "+sem2);
	}
}
interface Sports
{   
	float score=5.0f;
    	public void put_score();
}
class Result extends Test implements Sports
{     
	float total; 
	public void display()
     	{
		total=sem1+sem2+score;
		put_number();
		put_marks();
		put_score();
		System.out.println("Total: "+total);		
	}
	public void put_score()
	{
		System.out.println("Score: "+score);
	}
}
class Exp13
{
	public static void main(String args[])
	{
		Result r=new Result();
		r.get_number(12);
		r.get_marks(88.0f, 92.0f);
		r.display();
	}
}

//OUTPUT

/*
Roll No: 12
Marks Obtained in Sem-1: 88.0
Marks Obtained in Sem-2: 92.0
Score: 5.0
Total: 185.0
*/