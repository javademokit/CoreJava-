package String_Immutale_exaple;

public class B {
	 
	 B(String name)
	 {
	  System.out.println(name);
	  System.out.println(this);
	  System.out.println(getClass());
	 }

	 
	 public static void main(String[] args) {
	  B b=  new  B("shyam");
	  B b1=  new  B("shyam");
	  
	  System.out.println(b1==b);
	 
	  
	     String s1="Sachin"; 
	     
	     s1="shyam";
	    
	     String s2="Sachin";  
	     String s4="Saurav";  
	     String s3=new String("Sachin");
	     String s5=new String("Sachin");
	     System.out.println(s1==s2);
	     System.out.println(s1.equals(s2));//true  
	     System.out.println(s1.equals(s3));//true  
	     System.out.println(s1.equals(s4));//false  
	  
	  
	  
	  
	  
	  
	  
	 }
	}