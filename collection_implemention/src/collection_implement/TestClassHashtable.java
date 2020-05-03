package collection_implement;

import java.util.Hashtable;
import java.util.Map;

public class TestClassHashtable
{

    public static void main(String args[ ]) {
    Map<Integer,String> states= new Hashtable<Integer,String>();
    states.put(1, "INDIA");
    states.put(2, "USA");

    states.put(3, "null");    //will throw NullPointerEcxeption at runtime if you try to add null key

    System.out.println(states.get(1));
    System.out.println(states.get(2));
//  System.out.println(states.get(3));

    }
}
