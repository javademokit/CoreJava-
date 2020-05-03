package userdefindobject_key_in_hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hashsetnull
{
public static void main(String[] args)
{
	Set s=new HashSet();
	s.add(null);
	s.add(null);

	s.add(null);

	System.out.println(s);
	
	String s1="";//null print black..
	System.out.println(s1);
	
	
	Map<String,String>m=new HashMap<String,String>();
	m.put("a", "shyam");
	m.put("d", "shyam");
	m.put("c", "shyam");
	m.put("b", "shyam");
	m.put("a", "shyam");
	m.put("b", "shyam");
	System.out.println(m);


	
	
}
}
