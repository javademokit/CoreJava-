package Inner_Enum;
public class A
{
	private int a=9;
	class Inner
	{
		private int a=20;
		//we can not declare static method inner class 
		// we can declare only top level class
	/*static*/ void show()
	{
		
/*		A s=new A();
*//*		A.Inner iner=s.new Inner();
*/
		System.out.println("Inner ->showLnner()");
		
	    System.out.println(a);
		System.out.println(A.this.a);
	}
		
	}
	public static void main(String[] args)
	{
		A s=new A();
		A.Inner iner=s.new Inner();
		iner.show();
		System.out.println(iner.a);
		System.out.println(s.a);
		
		
		
		
		
	}
	
	
}
