package String_swap;

public class String_reverse_recursive
{
public static void main(String[] args)
{
	System.out.println(reverse("shyamrishabh"));
}
	public static String reverse(String str)
	{
		if(str==null||str.equals(""))
		{
			return str;
	    }
		
		return reverse(str.substring(1))+str.charAt(0);
	}
	
}
