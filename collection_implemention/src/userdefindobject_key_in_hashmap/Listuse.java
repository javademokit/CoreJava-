package userdefindobject_key_in_hashmap;

import java.util.ArrayList;

public class Listuse
{
public static void main(String[] args)
{
	Employee emp1=new Employee(101,"shyam1");
	Employee emp2=new Employee(101,"shyam");
	Employee emp3=new Employee(101,"shyam");
	ArrayList<Employee> em=new ArrayList<Employee>();
	
	em.add(emp1);
	em.add(emp2);
	em.add(emp3);
  for(Employee e:em)
  {
	  
	  System.out.println(e.id+"=="+e.name);
  }
}
}
