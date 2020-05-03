package collection_object_shorting;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Treeset
{
	
	
	public static void main(String[] args)
	{
	Employee s1=new Employee("shyam",1);
	Employee s2=new Employee("rishabh",5);
	Employee s3=new Employee("binita",2);
	Employee s4=new Employee("Aohan",3);
	Set<Employee>ls=new TreeSet<Employee>(new mycomparator());
	ls.add(s1);
	ls.add(s2);
	ls.add(s3);
	ls.add(s4);
	
    for(Employee s:ls)
    {
    	System.out.println(s.getName()+","+s.getAge());
    }


}
	
	
}

class mycomparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
	{
		Employee e1=(Employee)o1;
		
		Employee e2=(Employee)o2;

		String s1=e1.getName();
		String s2=e2.getName();
		return s1.compareTo(s2);
	}
	
	
	
}
