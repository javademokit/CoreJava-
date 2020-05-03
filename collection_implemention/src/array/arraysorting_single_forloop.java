package array;

import java.util.Arrays;

public class arraysorting_single_forloop
{
	
public static void main(String args[])
{
	
	 
    int arr[] = { 1, 2, 99, 9, 8, 
                  7, 6, 0, 5, 4, 3 }; 

   
    System.out.println("Original array: " + Arrays.toString(arr)); 

    // Sorting the array using a single loop 
    arr = sort(arr); 

    // Printing the sorted array. 
    System.out.println("Sorted array: "
                       + Arrays.toString(arr)); 
}

public static int [] sort(int[]arr)
{
	
	int length=arr.length;
	 // Sorting using a single loop 
    for (int j = 0; j < length - 1; j++)  
    { 
         
        if (arr[j] > arr[j + 1])  
        { 
            
            int temp = arr[j]; 
            arr[j] = arr[j + 1]; 
            arr[j + 1] = temp; 
              
            // updating the value of j = -1 
            // so after getting updated for j++ 
            // in the loop it becomes 0 and 
            // the loop begins from the start. 
            j = -1; 
        } 
    }
	return arr; 
	
}
	

}
