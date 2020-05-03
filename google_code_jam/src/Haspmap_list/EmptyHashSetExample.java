package Haspmap_list;

import java.util.HashSet;
class EmptyHashSetExample{ 
  public static void main(String[] args) {
     // Create a HashSet
	  
     HashSet<String> hset = new HashSet<String>();
 
     //add elements to HashSet
     hset.add("Element1");
     hset.add("Element2");
     hset.add("Element3");
     hset.add("Element4");
     hset.add("Element5");
 
     // Display HashSet elements
     System.out.println("Before: HashSet contains: "+ hset);
 
     /* public void clear(): It removes all the elements
      * from HashSet. The set becomes empty after this
      * method gets called.
      */
     hset.clear();
 
     // Display HashSet content again
     System.out.println("After: HashSet contains: "+ hset);
  }
}