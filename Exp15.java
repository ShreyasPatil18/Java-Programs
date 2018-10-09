class Number implements Runnable
{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++){
		System.out.println("Number-"+i);
		try{
			Thread.sleep(50);
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		}
	}	
}
class Square implements Runnable
{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++){
		System.out.println("Square of "+i+"="+(i*i));
		try{
			Thread.sleep(50);
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		}
	}
}
class Exp15
{
	public static void main(String[] args)
	{
		Thread t1=new Thread(new Number());
		Thread t2=new Thread(new Square());
		t1.start();
		t2.start();
	}
}
 
