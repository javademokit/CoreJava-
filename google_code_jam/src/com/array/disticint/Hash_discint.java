package com.array.disticint;

import java.util.HashSet;
public class Hash_discint
{
	// This function prints all distinct elements
    static void printDistinct(int arr[])
    {
        // Creates an empty hashset
        HashSet<Integer> set = new HashSet<>();
 
        // Traverse the input array
        for (int i=0; i<arr.length; i++)
        {
            if (!set.contains(arr[i]))
            {
                set.add(arr[i]);
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main (String[] args)
    {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        printDistinct(arr);
    }
}
