package array;

import java.util.Arrays;

public class Stringsortinginsingle_loop
{
	// Function for Sorting the array using a single loop 
    public static char[] sortArrays(char[] arr) 
    { 
 
        int length = arr.length; 
        for (int j = 0; j < arr.length - 1; j++) { 
            int d1 = arr[j]; 
            int d2 = arr[j + 1]; 
            // Comparing the ascii code. 
            if (d1 > d2) { 
                // Swapping of the characters 
                char temp = arr[j]; 
                arr[j] = arr[j + 1]; 
                arr[j + 1] = temp; 
                j = -1; 
            } 
        } 
  
        return arr; 
    } 
  
    
    public static void main(String args[]) 
    { 
  
        String geeks = "GEEKSFORGEEKS"; 
        char arr[] = geeks.toCharArray(); 
        System.out.println("Original array: "
                           + Arrays.toString(arr)); 
  
       
        arr = sortArrays(arr); 
  
        System.out.println("Sorted array: "+ Arrays.toString(arr)); 
        
        String str = String.valueOf(arr);
        System.out.println(str);
        
        char[] arr1 = { 'p', 'q', 'r', 's' };
        String str1 = String.copyValueOf(arr, 1, 2);
        System.out.println(str1);
        
        String p="null";
        String t=null;
        System.out.println(p.equals(t)); //false 
        System.out.println(p.length()); //4

        //System.out.println(t.length()); //NullPointerException

       
        
        
    } 
} 
