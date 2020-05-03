package ENUM;

import java.util.HashSet;
import java.util.Set;

public class Hashset_p
{
	public static void main(String[] args)
	{
		
	Set<String>ls=new HashSet<String>();
	
	ls.add("shyam");
	ls.add("Rishabh");
	ls.add("Rishabh");
	ls.add("abc");
	ls.add("sonu");
	
	//System.out.println(ls);
	
		for(String l:ls)
		{
			System.out.println(l);
		}
		
	}

}
