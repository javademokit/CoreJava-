package String_swap;

public class Stringswap
{
public static void main(String[] args)
{
	String a="mohan";
	String b="rishabh";
	a =a+b;
	b=a.substring(0,a.length()-b.length());
	a=a.substring(b.length());
	System.out.println(a);
	System.out.println(b);

	
}


}

