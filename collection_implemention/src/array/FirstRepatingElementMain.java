package array;

/* Java program to find first repeating element in arr[] */
import java.util.*; 
 
public class FirstRepatingElementMain 
{ 
	 
	static int getFirstRepeatingElementArray(int array[]) 
	{
		int minimumIndex = -1; 
		HashSet<Integer> set = new HashSet<>(); 
		
		for (int i=array.length-1; i>=0; i--) 
		{ 
			// If set contains the element, update minimum index 
			if (set.contains(array[i])) 
				minimumIndex = i; 
 
			else   
				set.add(array[i]); 
		} 
		return minimumIndex;
	} 
 
	public static void main (String[] args) throws java.lang.Exception 
	{ 
		int array[] = {10, 7, 8, 1, 8, 7, 6}; 
		int min=getFirstRepeatingElementArray(array); 
		// Print the result 
		if (min != -1) 
			System.out.println("The first repeating element in array is " + array[min]); 
		else
			System.out.println("There are no repeating elements"); 
	} 
} 