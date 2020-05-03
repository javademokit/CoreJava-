package com.array.disticint;

import java.util.MissingFormatArgumentException;

public class Print_onlydublicateElement_array
{
   public static void main(String[] args)
{
	   int []x={1,2,3,1,2,3};
	   for(int i=0;i<x.length;i++)
	   {
		   for(int j=i+1;j<x.length;j++)
		   {
			   if(x[i]==x[j])
			   {
				   System.out.println(x[i]);
			   }
			   
		   }
		    
	   }
}
	
	
}
