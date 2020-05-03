package array;

public class maxvalueinindex {
	public static void main(String args[])
	{
		int []x={12,7,9,9,8,7,6};
		int max= x[0];
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>max)
			{
				max=x[i];
				
			}
		}
		System.out.println(max);
	}

}
