package Array2D;

//Java implementation of the approach 
import java.util.*; 

class GFG { 

	// Generic function to check whether the given array 
	// has all identical element or not 
	public static <T> void checkIdentical(T array[]) 
	{ 

		// Create the Set by passing the Array 
		// as parameter in the constructor 
		Set<T> set = new HashSet<>(Arrays.asList(array)); 

		// Check the size of set, f size is 0 or 1 then 
		// array has only identical elements 
		if (set.size() == 1 || set.isEmpty()) { 
			System.out.print("Yes"); 
		} 
		else { 
			System.out.print("No"); 
		} 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 
		Integer arr[] = { 2, 2, 2, 2, 2, 2 }; 
		checkIdentical(arr); 
	} 
} 
