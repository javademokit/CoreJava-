package array;

public class avgrageoffirsthal {
	public static void main(String args[])
	{
		int x[]={12,67,78,9,70,89,56};
		int mid=x.length/2;
		int sum=0;
	
		
		for(int i=0;i<mid;i++)
		{
			sum=sum+x[i];
			double avg1 =sum/mid;
			System.out.println(avg1);
			
		}
		sum=0;
		int avg1 = 0;
		for(int i=mid;i<x.length;i++)
		{
			sum=sum+x[i];
			avg1=sum/mid;
			System.out.println(avg1);
		}
		
		
	}

}
