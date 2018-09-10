/* Write a program to perform addition and transpose of matrix using functions. */

import java.util.Scanner;
class Exp8
{
int a[][],b[][],sum[][],t[][];
int r,c,i,j;
	void read()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter No. of Rows And Columns: ");
	r=sc.nextInt();
	c=sc.nextInt();
	a=new int[r][c];
	b=new int[r][c];
	System.out.println("Enter First Matrix: ");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
		a[i][j]=sc.nextInt();
		}
	}
	System.out.println("Enter Second Matrix: ");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
		b[i][j]=sc.nextInt();	
		}
	}
	}
	void addition()
	{
	sum=new int[r][c];
	for(i=0;i<r;i++)	
	{
		for(j=0;j<c;j++)
		{
		sum[i][j]=a[i][j]+b[i][j];	
		}
	}	
	}
	void display()
	{
	System.out.println("Addition of Matrix: ");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
		System.out.print(sum[i][j]+" ");
		}
	System.out.println();
	}	
	}
	void transpose()
	{
	t=new int[r][c];
		for(i=0;i<r;i++)	
		{
			for(j=0;j<c;j++)
			{
			t[i][j]=sum[j][i];	
			}
		}
	System.out.println("Transpose of Matrix: ");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
		System.out.print(t[i][j]+" ");
		}
	System.out.println();
	}	
	}
	public static void main(String args[])
	{
	Matrix m=new Matrix();
	m.read();
	m.addition();
	m.display();	
	m.transpose();
	}
}
