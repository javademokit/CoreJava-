package static_keyword;

class JavaExample3{
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
	   }
	 }
