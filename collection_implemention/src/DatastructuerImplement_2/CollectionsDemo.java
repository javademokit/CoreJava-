package DatastructuerImplement_2;


import java.util.*;

public class CollectionsDemo {
   public static void main(String args[]) {
   
      // create array list object       
      List arrlist = new ArrayList();

      // populate the list
      arrlist.add("A");
      arrlist.add("B");
      arrlist.add("C");  

      System.out.println("Initial collection value: "+arrlist);

      // add values to this collection
      boolean b = Collections.addAll(arrlist, "1","2","3");

      System.out.println("Final collection value: "+arrlist);
   }    
}