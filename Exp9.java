import java.util.*;
class Exp9
{
	public static void main(String[] args)
	{
		String str,rev;
		StringBuffer str1=new StringBuffer();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String: ");
		str=sc.nextLine();
		str1.append(str);
		str1.reverse();
		rev=str1.toString();
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}

//OUTPUT

/*
Enter a String: Madam
Palindrome
*/
