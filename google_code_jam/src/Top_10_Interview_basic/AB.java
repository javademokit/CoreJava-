package Top_10_Interview_basic;

 class P
{

	 public void dispal()
	 {
		 System.out.println("parants dispaly");
		 
	 }
	 public void panrents()
	 {
		 System.out.println("parants method");
	 }
	 
}
 class C extends P
{
	 public void dispal()
	 {
		 System.out.println("child display------");
	 }
	 public void child()
	 {
		System.out.println("child class method"); 
	 }
	 
}
 class AB
{
	public static void main(String[] args)
	{ 
		C c=new C();
		c.child();
		c.panrents();
		c.dispal();
		System.out.println("-----------for class parants----");
		P p =new C();
		p.dispal();
		p.panrents();
	
		
	}
}
