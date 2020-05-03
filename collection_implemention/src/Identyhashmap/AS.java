package Identyhashmap;

public class AS {
public static void main(String[] args) {
	String s="shyam";
	String s1="shyam";
	/*s1="mohan";*/ /*craete new object*/
	System.out.println(s1==s);
	System.out.println(s1.hashCode());
	System.out.println(s.hashCode());
	System.out.println(s.equals(s1));
	System.out.println("------------------");
	String a=new String("shyam");
	String b=new String("shyam");
	b=null;
	System.out.println(b);
	System.out.println(a==b);
	System.out.println(a.equals(b));
}
}
