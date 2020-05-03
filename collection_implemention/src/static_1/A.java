package static_1;

public class A
{
	
	A A()
	{  
		return null;
	}
	static int a;
	int b; //non-static we can not call with null refrence
public static void main(String[] args)
{
 A a=null;
 System.out.println(a.a=90);
System.out.println(a.b=10);
}
	
}
