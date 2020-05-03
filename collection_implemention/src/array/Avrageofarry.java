package array;

public class Avrageofarry {
	
	public static void main(String args[])
	{
		int sum=0;
		double avg;
		int x[]={12,78,9,9,7,5,6,4,8};
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
			
		}
		avg=sum/x.length;
		System.out.println(avg);
	}

}
