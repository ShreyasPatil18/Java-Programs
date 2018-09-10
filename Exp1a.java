/* 
Write a program to shift a number three bits right and display the result (take input using scanner class).
*/

import java.util.*;
class Exp1a
{
	public static void main(String[] args)
	{
		int a,rightshift;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter The Number:");
		a=s.nextInt();
		rightshift=a>>3;
		System.out.println("Before Right Shift:"+a+"\nAfter Right Shift:"+rightshift);		
	}
}

//OUTPUT
/*
Enter The Number:55
Before Right Shift:55
After Right Shift:6
*/
