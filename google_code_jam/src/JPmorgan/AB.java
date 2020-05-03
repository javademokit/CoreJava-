package JPmorgan;

class A
{
	
	// we can not remove this 
     A()
	{
		System.out.println("non arg");
	}
	 A(int a)
	{
		System.out.println("a");
	}
}
class B extends A
{
	public B(int a)
	{  
		System.out.println("b");
	}
}
public class AB
{
	public static void main(String[] args)
	{
		B b=new B(10);
	}
}
