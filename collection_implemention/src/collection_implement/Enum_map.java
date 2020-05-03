package collection_implement;

//Java program to demonstrate clear() method
import java.util.*;

//An enum of geeksforgeeks ranking across
//Worldwide & in India is created
 enum gfg {
 Global,
 India
}
;

class Enum_map {
 public static void main(String[] args)
 {

     EnumMap<gfg, Integer> mp = new EnumMap<gfg, Integer>(gfg.class);

     // Values are associated in mp
     mp.put(gfg.Global, 800);
     mp.put(gfg.India, 72);

     // Values in mp before removing
     System.out.println("Values in map before removing " + mp);

     // Removing the values from mp
     mp.clear();

     // Values in mp after removing
     System.out.println("Values in map after removing " + mp);
 }
}