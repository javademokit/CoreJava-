package final_object;

public  final class finalobject {
	 
	 public static void main(String[] args) {
	  
	/*final*/  finalobject s1=new finalobject();  // if make final we can not change object 
	    System.out.println(s1.hashCode());
	  
	    s1=new finalobject(); // object refrence we can not change it
	  
	  System.out.println(s1.hashCode());
	 }

	}