package overriding;

public class Main
{
public static void main(String[] args)
{
	
	A a=new A();
	 a.show();
	 System.out.println("--------");
	 a =new B();
	 a.show();
	
	 System.out.println("-----");
	 
	 a=new C();
	 a.show();
	 System.out.println("--------");
	 a=new D();
	 a.show();
	 
	 
	 System.out.println("downcasting example-----");
	 
	// B b=(B) new A();
	// b.show();// we can not override in downcasting ----
	// b.hello();
	 B b1=new B();
	 b1.show();
	// b1=(B) new A();
	 
	 
	 
}
}
