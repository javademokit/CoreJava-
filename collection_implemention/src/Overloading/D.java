package Overloading;

class F
{
	public void shwo()
	{
		System.out.println("hello----");
	}
}
public class D extends F
{

	void show()
	{
		System.out.println("hello b");
	}
	
	public static void main(String[] args)
	{
		D d=new D();
		d.show();
		F f=new D();
		D j=(D) new F();// casting up
		j.show(); // run time error throw 
	}
}
