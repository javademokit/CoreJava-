package Top_10_Interview_basic;

public class equals
{

	
	public static void main(String[] args)
	{

		String s=null;
		String s1="shyam";
		if(s==s1)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		System.out.println("---equals----");
		
		
		
		if(s.equals(s1))//java.lang.NullPointerException//run
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
	}
}
