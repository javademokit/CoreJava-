package singletone;
/* * Java Program to find missing 
 * numbers in an integer * array with duplicates. Array may contains more * than one duplicates. 
 * * * input: {1, 1, 2, 3, 5, 5, 7, 9, 9, 9}; 
 * * output: 4, 6, 8 */

public class findingmissingvalue
{
	 // Function to ind missing number 
    static int getMissingNo(int a[], int n) 
    { 
        int i, total; 
        total = (n + 1) * (n + 2) / 2; 
        for (i = 0; i < n; i++) 
            total -= a[i]; 
        return total; 
    } 
public static void main(String[] args)
{
	/*int[] input = {1,3,4,5,6,7,8,9,10};
	 int[] register = new int[input.length];
	 for (int i : input) 
	 { register[i] = 1; 
	 }
	 System.out.println("missing numbers in given array");
	 for (int i = 1; i < register.length; i++)
	 { 
		 if (register[i] == 0) 
		 { 
			 
			 System.out.println(i); 
			 } 
		 } */
	 
	 int a[] = { 1, 2, 4, 5, 6 }; 
     int miss = getMissingNo(a, 5); 
     System.out.println(miss); 
	 }

}

