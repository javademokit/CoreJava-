package collection.natural.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayNaturalsorting
{
	
	public static void main(String[] args)
	{
		
		List<String>list=new ArrayList<String>();
		list.add("shyam");
		list.add("mohan");
		list.add("sonu");
		list.add("Rishabh");
		list.add("Binita");
		/**
		 * Natural sorting ...
		 */
		Collections.sort(list);
		System.out.println(list);
		for(String s:list)
		{
			System.out.println(s);
		}
		
		
	}

}
