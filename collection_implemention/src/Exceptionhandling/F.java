package Exceptionhandling;

class H
{
	public void show(int a,int b) throws ArithmeticException
	{
		//int a1=10,b1=5; we can not take same varibale
		
		int c=a/b;
		System.out.println(c);
		
	}
}
class P extends H
{
	public void show(int a,int b)
	{
		int c=a/b;
		System.out.println(c);
	}
}

public class F
{
public static void main(String[] args)
{
	H a=new H();
	   a.show(1, 0);
	   
	   P b=new P();
	   b.show(4, 2);
}
}

