package Top_10_Interview_basic;
//basic question---
public class B
{
static String sd="";
static String sd1; //default null

public static void main(String[] args)
{
	String s=null;  
	//System.out.println(s.hashCode());// java.lang.NullPointerException
	System.out.println(s);//null
	//System.out.println(s.length());//null// java.lang.NullPointerException
	System.out.println("------null---------");
	String p=null;
	String p1="shyam";
	String p3=p1+p;
	System.out.println(p3); //shyamnull
	System.out.println("---empty------");
	String d="";
	System.out.println(d.hashCode());//0
	System.out.println(d.length());//0
	System.out.println(d);// empty 
	String sd;
	System.out.println(B.sd);
	System.out.println("--concate-------");
	String a="";
	String b="shyam";
	String c=a+b;
	System.out.println(c);
	

}
	
	
	
}
