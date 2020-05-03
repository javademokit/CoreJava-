package array;

public class minimumvalue {
	public static void main(String args[])
	{
		int []x={12,7,9,6,90,78,};
		int min=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(x[i]<min)
			{
				min=x[i];
			}
		}
		System.out.println(min);
	}

}
