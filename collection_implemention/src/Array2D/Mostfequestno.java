package Array2D;

import java.util.HashMap;
import java.util.Map;

public class Mostfequestno
{
	public static void main(String[] args)
	{
	int a[]= {1,1,2,2,3,3,3,3,4,4,4,4,4,4,4,4,4,4};
	
	cal(a);
	}
	
	public static  void cal(int []a)
	{
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
		}
		System.out.println(map);
		int max=0;
		for(Map.Entry<Integer, Integer>val:map.entrySet())
		{
			if(max<val.getValue())
			{
				max=val.getValue();
			}
		}
		for(Map.Entry<Integer, Integer>al:map.entrySet())
		{
			if(al.getValue()==max)
			{
				System.out.println("most repeated number is :"+al.getKey()+":"+max);
			}
		}
		
	}
}
