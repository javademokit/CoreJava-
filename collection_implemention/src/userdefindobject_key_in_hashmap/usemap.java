package userdefindobject_key_in_hashmap;

import java.util.HashMap;
import java.util.Map;

public class usemap
{
public static void main(String[] args)
{
	Employee emp1=new Employee(101,"shyam");
	Employee emp2=new Employee(101,"shyam");
	Employee emp3=new Employee(101,"shyam");
	Employee emp4=new Employee(101,"shyam");
	Employee emp5=new Employee(101,"shyam");

	HashMap<Employee, String>map=new HashMap();
	map.put(emp1, "user1");
	map.put(emp2, "user2");
	map.put(emp3, "user3");
	map.put(emp4, "user4");
	map.put(emp5, "user5");

	
	for(Map.Entry<Employee, String>entry:map.entrySet())
	{
		
		System.out.println(entry.getKey()+"=="+entry.getValue());
	}

	
}
	
	
}
