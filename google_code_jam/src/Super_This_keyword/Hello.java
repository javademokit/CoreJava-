package Super_This_keyword;

public class Hello extends Ha
{
	int a=20;
	
 public  void show()
	{
		
	 int a=30;
	 System.out.println(a);
	 System.out.println(this.a);// it will take global instance varibale menas class current object
	 System.out.println(super.a);
	 
	}
	
	

}
