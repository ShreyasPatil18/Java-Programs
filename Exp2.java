/*
Write a program to print grade of the student according to given range using switch statement
*/

import java.util.*;
class Exp2
{
	public static void main(String[] args)
	{
		int marks;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Marks: ");
		marks=s.nextInt();
		switch(marks/10)
		{
			case 0:
			case 1:
			case 2:
			case 3:
				System.out.println("Fail");
				break;
			case 4:
				System.out.println("Pass");
				break;
			case 5:
				System.out.println("Second Class");
				break;
			case 6:
				System.out.println("First Class");
				break;
			case 7:
			case 8:
			case 9:
			case 10:
				System.out.println("Distinction");
				break;
			default:
				System.out.println("Invalid Marks");
				break;
		}
	}
} 

//OUTPUT

/*
Enter the Marks: 90
Distinction
*/