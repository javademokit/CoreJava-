package collection_array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HaspmapRetrive_value {
public static void main(String[] args) {
	
	 Map<Integer, String> testMap = new HashMap<Integer, String>();
     testMap.put(10, "a");
     testMap.put(20, "b");
     testMap.put(30, "c");
     testMap.put(40, "d");
     for (Entry<Integer, String> entry : testMap.entrySet()) {
    	 
    	 System.out.println(entry.getValue());
    	 
         if (entry.getValue().equals("c")) {
        	 
             System.out.println(entry.getKey());
         }
     }
 }
}

