package static_keyword;

public class JavaExample4
{
	 
	 /*final*/  static int var1;
	 /*final */ static String var2;
	   //This is a Static Method
	   static void disp(){
	       System.out.println("Var1 is: "+var1);
	       System.out.println("Var2 is: "+var2);
	   }
	   
	   public static void main(String args[]) 
	   {
	       disp();
	       System.out.println(10+20+"shyam");
	       System.out.println("shyam" +(10+20)+"");
	       System.out.println("shyam"+1+2);
	       System.out.println(1+2+3 +"sdfg");

	   }
}
