package Arrayrotated;

import thread.mainclass;

public class leftonerotated
{
public static void main(String[] args)
{
	int []arr={1,2,4,34,5,};
    int temp=arr[0];
	
	for(int i=1;i<arr.length;i++)
	{
		arr[i-1]=arr[i];
	}
	arr[arr.length-1]=temp;
	
	for(int k=0;k<arr.length;k++)
	{
		System.out.println(arr[k]);
	}
		
}
}
