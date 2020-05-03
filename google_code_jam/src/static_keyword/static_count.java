package static_keyword;

public class static_count
{
	static int count=0;//will get memory only once and retain its value  
	  
	static_count(){  
	count++;//incrementing the value of static variable  
	System.out.println(count);  
	}  
	  
	public static void main(String args[]){  
	//creating objects  
		static_count c1=new static_count();  
		static_count c2=new static_count();  
		static_count c3=new static_count();  
	}  
}
