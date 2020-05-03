package Permotation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class word_possibility
{
	public static void main(String[] args)
	{
		String s="XYZ";
		List<String>ls1=new ArrayList();
		
		ls1=permutations(s);
		Collections.sort(ls1);
		System.out.println(ls1);
	}
	
	public static List<String> permutations(String s)
	{
	    List<String>combinations=new ArrayList<String>();
	    
	    if(s.length()==1){
	        combinations.add(s);
	    }
	    else{
	        for(int i=0;i<s.length();i++)
	        {
	            List<String>temp=permutations(s.substring(0, i)+s.substring(i+1));
	            
	            for (String string : temp) {
	                combinations.add(s.charAt(i)+string);
	            }
	        }
	    }
	    return combinations;
	}
	
}
