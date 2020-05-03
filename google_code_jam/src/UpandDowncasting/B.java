package UpandDowncasting;
class A
{
 public A()
 {
	 System.out.println("A");
 }
 public void show()
 {
	 System.out.println("show A");
 }
}
public class B extends A
{

	public B()
	{
		System.out.println("B");
	}
	public void show()
	 {
		 System.out.println("show B");
	 }
	public static void main(String[] args)
	{
		System.out.println("===============");
		A a=new B();
		a.show();
		/*B b=(B)new A();
		b.show();*/
		
		
	}
}
