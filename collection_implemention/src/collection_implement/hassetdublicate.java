package collection_implement;

import java.util.HashSet;
import java.util.Set;

import thread.mainclass;

public class hassetdublicate
{
public static void main(String[] args)
{
	Set<String> ls=new HashSet<String>();
	
	ls.add("shyam");
	ls.add("shyam");
	ls.add("shyam");
	ls.add("shyam");
	ls.add("shyam");
	ls.add("shyam");
	ls.add("Rishabh");
	
	
	
	for(String s:ls)
	{
		//System.out.println(s.hashCode());
		System.out.println(s);

	}
}
}
