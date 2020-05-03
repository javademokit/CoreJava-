package com.datastructure;

public class reverseelementofarray
{
public static void main(String[] args)
{
	int []x={1,2,3,4,55,7,8,2};
	for(int i=0;i<x.length/2;i++)
	{
		int temp=x[i];
		x[i]=x[x.length-i-1];
		x[x.length-i-1]=temp;
		
	}
	
	for(int i=0;i<x.length;i++)
	{
		System.out.println(x[i]);
	}
	System.out.println();
}
}
