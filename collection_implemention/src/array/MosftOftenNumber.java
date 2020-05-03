package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MosftOftenNumber 
{
public static void main(String[] args)
{
	
   Integer[] a = { 11, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 1, 2, 2, 2, 2, 3, 4, 2 };
   
   List<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
   
   Set<Integer> set = new HashSet<Integer>(list);
   
   int highestSeq = 0;
   int seq = 0;
   
   for (int i : set) 
   {
       int tempCount = 0;
       
       for (int l : list) {
           if (i == l) {
               tempCount = tempCount + 1;
           }
           if (tempCount > highestSeq) {
               highestSeq = tempCount;
               seq = i;
           }
       }

   }
   System.out.println("highest sequence is " + seq + " repeated for " + highestSeq);
   
   
   
   
   /*
   HashMap<Integer,Integer>hasmap=new HashMap<Integer,Integer>();
   for(Integer c1:a)
	{
	   hasmap.put(c1, hasmap.getOrDefault(c1,0)+1);
	}
	System.out.print(hasmap);
	
	for(Entry<Integer, Integer> e:hasmap.entrySet())
	{
		System.out.println(e.getKey()+":"+e.getValue());
		

	}
	
   
*/
}



}

