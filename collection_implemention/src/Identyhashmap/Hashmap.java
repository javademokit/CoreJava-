package Identyhashmap;

import java.util.HashMap;
import java.util.Map;

class person{
	
	int age;
	String name;
	public person(int age, String name)
	{
		super();
		this.age = age;
		this.name = name;
	}
	
}
public class Hashmap
{

	static Map<Integer,person>ls;
	public static void main(String[] args)
	{
		ls=new HashMap<Integer,person>();
		
		person p=new person(1,"shyam");
		person p1=new person(1,"shyam");
		
		
		ls.put(1, p);

		ls.put(2, p1);
		System.out.println(ls);
		

		
	}
	
	
}
