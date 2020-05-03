package Abstraction;

public class A extends AB
{

	
	

	@Override
	public void hey()
	{
		System.out.println("hello");
		 
	}
	// if you want to print this  services 
	
	public /*static*/ void show(int a)  // complete implementation
	{
		System.out.println("----------------"+a);
	}
	
	
	public static void main(String[] args)
	{
		
		AB ab;
		A a=new A();
		System.out.println(a.a);
		a.hey();
		a.show(10);
		a.show(40);
		
	}
}
