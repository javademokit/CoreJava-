package collection_array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashmapKeyExist {
    public static void main(String[] args) {
        HashMap<String, String> hmap = new HashMap<String, String>();
        hmap.put("1", "Bala");
        hmap.put("2", "Test");
        Boolean cantain = hmap.containsValue("Bala");
        
        if(hmap.containsKey("2") && hmap.containsValue("Test"))
        {
            System.out.println("Yes");
        }
        if(cantain == true)
        {
            System.out.println("Yes"); 
        }

        Set setkeys = hmap.keySet();
        Iterator it = setkeys.iterator();

        while(it.hasNext())
        {
            String key = (String) it.next();
            if (hmap.get(key).equals("Bala"))
            {
                System.out.println(key);
            }
        }
    }
}