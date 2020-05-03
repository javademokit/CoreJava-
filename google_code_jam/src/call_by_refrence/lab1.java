package call_by_refrence;
class Hai
{
	int a;
}
class Hello
{
	public void m1(Hai hai)
	{
	System.out.println("value is "+hai.a);
	
	hai.a=hai.a+10;
	}
}
public class lab1
{
public static void main(String[] args)
{
	Hello h=new Hello();
	Hai hai=new Hai();
	hai.a=99;
	System.out.println("value is "+hai.a);
h.m1(hai);
}
}
