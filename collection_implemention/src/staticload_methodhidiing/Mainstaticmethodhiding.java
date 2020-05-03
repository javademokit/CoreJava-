package staticload_methodhidiing;
class A
{
	static int a=8;
	public void m2()
	{
		System.out.println("non static A");
	}
	public static void m1()
	{
		System.out.println(" static A");

	}
}
class B extends A
{
	public void m2()
	{
		System.out.println(" static B");

	}
	public static void m1()
	{
		System.out.println(" static B");

	}
	
}


public class Mainstaticmethodhiding
{
public static void main(String[] args)
{
	A a=new B();
	a.m1();
	B.m1(); // B class method 
	System.out.println("----");
	a.m2(); // overriding a class method
	System.out.println(B.a); // it'll not create B class object 
	System.out.println("--------------");
	
	
	B b=(B)a;
	  b.m2(); 
	
	
	
	
	
	
	
	
}
}
