package Overriding;
class D
{
	public  /*final*/ int sum(int a,int b)
	{
		System.out.println("-----------d");
		return a+b;
		
	}
	
}
class m extends D
{
	public int   sum(int a,int b)
	{
		System.out.println("-----------m");
		return a+b;
		
	}
	
}
public class A
{
	public static void main(String[] args)
	{
		
	
	D d=new D();
	int c=d.sum(12,20);
	System.out.println(c);
	m p=new m();
	int r=p.sum(12,20);
	System.out.println(r);
     System.out.println("------------");
     D d2=new m();
    int f= d2.sum(60, 40);
    System.out.println(f);
     

	
	}

}
