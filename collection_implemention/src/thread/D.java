package thread;


class A

{
	int a,b;
	
}
class B extends A
{
	
		
	int d;

	public int show(int a,int b)
	{
		d=a+b;
		return d;
		
	}
}

public class D extends B {
	
	public static void main(String[] args) {
		
		B b=new B();
		D d=new D();
		System.out.println(d.show(56, 8));
		
		System.out.println(b.show(10, 20));
	}
	


}
