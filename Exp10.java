import java.util.*;
public class Exp10
{
	public static void main(String args[])
	{
		int ch,i=0;
 		String choice="";
		Scanner sc = new Scanner(System.in);
 		String str;
 		Vector v=new Vector();
  		do
  			{ 
    			System.out.println("1. Add new name");
    			System.out.println("2. Display");
    			System.out.println("Enter Your Choice");
    			ch=sc.nextInt();
    			switch(ch)
    				{   
				case 1: 
					{ 
					System.out.print("Enter Name : ");
		  			str=sc.next(); 
                  			v.addElement(str);
                  			break;
                 			}
        			case 2: 
					{ 
					System.out.println("Current List");
                  			for(i=0;i<v.size();i++)
                  				{
						System.out.println(v.elementAt(i));
                  				}
                  			break;
                 			}
				default: System.out.println("Invalid choice");
				}        
    			System.out.println("Do you want to continue(y/n)");
    			choice=sc.next();
    		}
		while(choice.equals("y")||choice.equals("Y"));
  	}
}

//OUTPUT

/*
1. Add new name
2. Display
Enter Your Choice
1
Enter Name : Shreyas
Do you want to continue(y/n)
y
1. Add new name
2. Display
Enter Your Choice
2
Current List
Shreyas
Do you want to continue(y/n)
n
*/
