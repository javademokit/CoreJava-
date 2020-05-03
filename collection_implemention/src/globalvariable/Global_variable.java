package globalvariable;

public class Global_variable
{
 static  String name="shyam";
 int a;
 final static String s2=""; // default value is null
  final String s3=""; // final non-static need initalize
 
	
public void show()
{
	//Global_variable.name;// global static varibale we can not acssces in non static block
}
public static void main(String[] args)
{
	final int a;// local variable must be initilize----
	int b;
	//System.out.println(b);
	System.out.println(s2);
	char ch='\"'; //"
	System.out.println(ch);
	char ch1='\\';
	System.out.println(ch1);
	
			
	      
}
}
