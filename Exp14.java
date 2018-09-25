import java.lang.*;
import java.util.*;
class OddException extends Exception
{
	int num;
	OddException(int x)
	{
		num=x;
	}
	public String toString(){
		return "Error: "+num+ " is even";
	}
}
class Exp14
{
	static void  oddNoFuntion(int n) throws OddException {
		if(n%2==0)
			throw new OddException(n);
		else
			System.out.println("Number="+n+" is odd");
	}
	public static void main(String[] args)
	{
		try{
			oddNoFuntion(3);
			oddNoFuntion(2);
		}
		
		catch(Exception e){
			System.out.println(e.toString());
		}
	}
}