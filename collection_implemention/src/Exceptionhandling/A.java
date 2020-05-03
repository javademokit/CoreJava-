package Exceptionhandling;

public class A
{

	public  void show()throws ArithmeticException
	{
		int a=10,b=2;
		int c=a/b;
		System.out.println(c);
		show(1,2);
	}
	public void show(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		//show(1,3);
	}
	
	
	
	public static void main(String[] args)
	{
		A b=new A();
		 b.show();
		 b.show(12, 20);
	}
	
}
