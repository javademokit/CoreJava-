package collection_implement;

import java.util.HashSet;
import java.util.Set;

class Employe
{
	int id;
	String name;
	Employe(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		if (id != other.id)
			return false;
		if (name == null)
		{
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}


public class hashset
{
public static void main(String[] args)
{
	
	
	Set<String> l=new HashSet<String>();
	l.add("shyam");
	l.add("shyam");
	l.add("shyam");
	l.add("shyam");
	l.add("shyam");
	l.add("Rishabh");
	
	Set<Employe> list=new HashSet<Employe>();
	
	Employe e1=new Employe(1,"shyam");
	Employe e2=new Employe(1,"shyam");
	
	list.add(e1);
	list.add(e2);
	System.out.println(list.size());
	for(Employe s:list)
	{
		System.out.println(s.id+";"+s.name);
	}
}
}
