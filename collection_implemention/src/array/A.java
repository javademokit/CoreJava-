package array;

public class A {
	public static void main(String args[])
	{
		int []x={12,3,3,4,5,6,7,};
		for(int i=1;i<x.length;i++)
		{
			if(x[i]>x[i-1])
					{
				
				int temp =x[i];
				x[i]=x[i-1];
				x[i-1]=temp;
				
				
					}
		}
		
		
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]);
		}
		
	}

}
