package String_swap;

public class Stringliteral
{
	//String s="shyam"; we can table local variable and global 
	//variable as same name same data type.......
	public static void main(String[] args)
	{
		String s="shyam";
		s.concat("sonu");
	   //=s.concat("mohan");
		System.out.println(s);
	    s=s.concat("mohan");
	    System.out.println(s);

	} 

}
