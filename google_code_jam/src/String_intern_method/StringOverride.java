package String_intern_method;

public class StringOverride
{
	public static void main(String[] args)
	{
		String s1=new String("shyam");
		
		System.out.println(s1.hashCode());

		String s2=s1.intern();

		System.out.println(s2.hashCode());
		
		System.out.println(s1==s2);
		
		
		
	}

}
