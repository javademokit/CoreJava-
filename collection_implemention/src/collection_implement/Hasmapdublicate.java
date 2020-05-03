package collection_implement;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import thread.mainclass;
class Address
{
	int id;
	String name;
	Address(int id,String name)
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
		Address other = (Address) obj;
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
public class Hasmapdublicate
{
	public static void main(String[] args)
	{

		Map<Integer,Address>m1=new HashMap<Integer,Address>();
		
		Address e1=new Address(1,"shyam");
		Address e2=new Address(1,"shyam2");
		Address e3=new Address(1,"shyam");
		Address e4=new Address(4,"Rishabh");
		m1.put(1, e1); // if id same it give size 1
		m1.put(1, e2);// if change the key value it will pring diff id name 
		m1.put(3, e3);
		m1.put(4, e4);
		System.out.println("size of hashmap:"+m1.size());
		
		
		
		for(Entry<Integer, Address>ls:m1.entrySet())
       {
	     System.out.println(ls.getKey()+":"+  ls.getValue().id+ ";"+ls.getValue().name);
	   
      }
		
	}

}
