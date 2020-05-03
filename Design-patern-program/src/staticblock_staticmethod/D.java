package staticblock_staticmethod;
class A
{
	static
	{
		System.out.println("static a");
	}
}
class B extends A
{
	static
	{
		System.out.println("static B");
	}
}
class C extends B
{
	static
	{
		System.out.println("static C");
	}
	
	
}
public class  D
{
	static
	{
		System.out.println("last");
	}
public static void main(String args[])
{
	C c=new C();
	
	
	A a=new A();
	}
}
	

