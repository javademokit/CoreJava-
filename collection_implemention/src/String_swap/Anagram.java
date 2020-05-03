package String_swap;

import java.util.HashSet;
import java.util.Set;

import sun.nio.cs.ext.ISCII91;

public class Anagram
{
	public static void main(String[] args)
	{
		Set<String>ls=new HashSet<>();
		ls.add(new String("A"));
		ls.add(new String("A"));
		ls.add(new String("A"));
		ls.add(new String("A"));
		System.out.println(ls);
		

		
		
		String s1="ab";
		String s2="ab";
		Boolean b=isAnagram(s1,s2);
		System.out.println(b);
	}
	public  static boolean  isAnagram(String s, String t) {
	    if(s==null || t==null)
	        return false;
	 
	    if(s.length()!=t.length())
	        return false;
	 
	    int[] arr = new int[26];
	    for(int i=0; i<s.length(); i++){
	        arr[s.charAt(i)-'a']++;
	        arr[t.charAt(i)-'a']--;
	    }
	 
	    for(int i: arr){
	        if(i!=0)
	            return false;
	    }
	 
	    return true;
	}
}
