package Array2D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arraymissingelement
{
public static void main(String[] args)
{
	
	int [] b=new int[2];
	b[0]=10;
	b[1]=10;
	//b[2]=10;

	
	
	

	int []a = {23,1,3,4,5,6,7,8,10,11,12,34,35,24,26};
	
	Arrays.sort(a);
	
	List<int[]> as= Arrays.asList(a);
	System.out.println(as);
	
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+",");
	}
	  
	
	
	
	
	 ArrayList<Integer>ls = new ArrayList<Integer>(2);
	 
	 ls.add(1);
	 ls.add(3);
	 ls.add(5);
	 ls.add(5);
	 ls.add(5);
	 System.out.println(ls);

	
	  }

}
