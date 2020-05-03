package charactercountinhashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.zip.Inflater;
public class HasmpaString_to_array {
public static void main(String[] args) 
{
	HashMap<Character,Integer>hasmap=new HashMap<Character,Integer>();
	String s="shyamshyam";
	for(char c:s.toCharArray())
	{
		hasmap.put(c, hasmap.getOrDefault(c, 0)+1);
	}
	System.out.println(hasmap);
	
	
	
}
}
