/* 
Write a program to shift a number three bits right and display the result (using command line argument).
*/

class Exp1b
{
	public static void main(String[] args)
	{
		int rightshift,a;
		a=Integer.parseInt(args[0]);
		rightshift=a>>3;
		System.out.print("Before Right Shifting:"+a+"\nAfter Shifting:"+rightshift);
	}
}

//OUTPUT

/*
C:\Users\DELL\Desktop\Java Programs>java Exp1b 85
Before Right Shifting:85
After Shifting:10
*/