package Stockmarket;

public class Maxprofit
{
public static  void main(String args[])
{
	int a=Integer.MAX_VALUE;
	int b=Integer.MIN_VALUE;
	//System.out.println(a);
	//System.out.println(b);
	
	int []arr= {14,12,70,15,99,65,21,90};
	
	System.out.println(maxprofit(arr));
}

public static int maxprofit(int []arr)
{
	int lowestpricetillthatday=arr[0];
	int maxprofit=Integer.MIN_VALUE;
	
	for(int i=0;i<arr.length;i++)
	{
		int profit=0;
		
		if(arr[i]>lowestpricetillthatday)
		{
			profit=arr[i]-lowestpricetillthatday;
			if(profit>maxprofit)
			{
				maxprofit=profit;
			}
			else
			{
				lowestpricetillthatday=arr[i];
			}
		}
		
	}
	return maxprofit;
	
	
	
	
	
	
}
}
