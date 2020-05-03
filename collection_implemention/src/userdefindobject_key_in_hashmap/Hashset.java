package userdefindobject_key_in_hashmap;

import java.util.HashSet;
import java.util.Set;

public class Hashset
{
	public static void main(String[] args)
	{
		Employee emp1=new Employee(101,"shyam");
		Employee emp2=new Employee(101,"shyam");
		Employee emp3=new Employee(101,"shyam");
		
		System.out.println(emp1.hashCode()+"-"+emp2.hashCode()+"-"+emp3.hashCode());
		System.out.println(emp1.equals(emp2));// compaire object  only--
		
		
		System.out.println(emp1==emp2);
		
       Set<Employee>st=new HashSet();
       st.add(emp1);
       st.add(emp2);
       st.add(emp3);
       
       for(Employee s:st)
       {
    	 
    	   System.out.println(s.id+""+s.name);
       }
       
	}
}
