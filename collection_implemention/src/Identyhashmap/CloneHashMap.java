package Identyhashmap;

import java.util.HashMap;

public class CloneHashMap { 
	
     public static void main(String a[]) {    
        HashMap hashMap = new HashMap();    
        HashMap hashMap1 = new HashMap();    
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        System.out.println("Original HashMap : " + hashMap);
        
        hashMap1 = (HashMap) hashMap.clone();
        System.out.println("Copied HashMap : " + hashMap1);    
    }    
}