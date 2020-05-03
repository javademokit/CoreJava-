package singletone;

import java.util.HashMap;
import java.util.Map;

public class ocurancecount
{
public static void main(String args[])
{
	String s="shyamlalyadav";
	char[] arr=s.toCharArray();
	Map<Character, Integer> mp=new HashMap<Character,Integer>();
	
	for(char c:arr) 
	{
		if(mp.containsKey(c))
		{
			mp.put(c, mp.getOrDefault(c, 0)+1);
		}
		else
		{
			mp.put(c, 1);
		}
		
	}
	System.out.println(mp);
	
}
}
