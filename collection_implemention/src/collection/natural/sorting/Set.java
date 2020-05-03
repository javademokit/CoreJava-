package collection.natural.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Set 
{
	public static void main(String[] args)
	{
		
		
		HashSet<String> ls=new HashSet<String>();
		ls.add("Mohan");
		ls.add("shyam");
		ls.add("Abhishk");
		ls.add("Rohit");
		ls.add("Bikash");
		
		/*LinkedHashSet<String>as=new LinkedHashSet<String>(ls); 
		System.out.println(as);*/
		
		System.out.println(ls);
		 List<String> tempList = new ArrayList<String>(ls); 
		 Collections.sort(tempList); 
		 System.out.println("HashSet element in sorted order : " + tempList);
		  TreeSet<String> sorted = new TreeSet<String>(ls); 
		  System.out.println("HashSet sorted using TreeSet : " + sorted);  

		
	
		  
		  System.out.println("natural-------");
		  
		  HashSet<String> fruits = new HashSet<String>();
          
	       fruits.add("Orange");
	       fruits.add("Apple");
	       fruits.add("Banana");
	       fruits.add("Guava");
	       fruits.add("Pear");
	           
	       System.out.println("HashSet elements before sorting: "+fruits);
	           
	           
	       // Method 1: Sorting HashSet using List interface
	       List<String> fruitList = new ArrayList<String>(fruits);
	       Collections.sort(fruitList);
	           
	       // Displaying list
	       System.out.println("HashSet elements after sorting: "+fruitList);
	           
	       // Method 2: Sorting using TreeSet
	       TreeSet<String> tset = new TreeSet<String>(fruits);
	           
	       System.out.println("HashSet elements after using TreeSet: "+tset);
	   }
		  
		  
		  
		  
		  

}

	
	

