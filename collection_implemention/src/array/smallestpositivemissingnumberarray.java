package array;

import java.util.LinkedHashMap;
import java.util.Map;

public class smallestpositivemissingnumberarray
{
	// Function to find the smallest positive  
    // missing number  
    static int missingNumber(int a[], int n)  
    { 
        // Declaring an unordered_map  
        Map<Integer, Integer> mp = new LinkedHashMap<>(); 
  
        // if array value is positive  
        // store it in map  
        for (int i = 0; i < n; i++)  
        { 
            if (a[i] > 0)  
            { 
                mp.put(a[i], mp.get(a[i]) == null ? 1 : mp.get(a[i]) + 1); 
            } 
        } 
  
        // index value set to 1  
        int index = 1; 
  
        // Return the first value starting  
        // from 1 which does not exists in map  
        while (true)  
        { 
            if (!mp.containsKey(index))  
            { 
                return index; 
            } 
  
            index++; 
        } 
    } 
  
    // Driver code  
    public static void main(String[] args)  
    { 
        int a[] = {1, 1, 1, 0, -1, -2}; 
        int size = a.length; 
  
        System.out.println("Smallest positive missing number is : "
                + missingNumber(a, size)); 
    } 
} 
  
