package construction_recusrive_call;

public class A
{
A()
{
	A a=new A();
}
	
public static void main(String[] args)
{
	new A();
}
	
	
}
