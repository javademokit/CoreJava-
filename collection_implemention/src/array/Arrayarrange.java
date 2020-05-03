package array;

public class Arrayarrange {
	public static void main(String args[])
	{
		int []x={1,1,13,5,6,3,2,4,-1};
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				if(x[i]>x[j])
				{
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
					
					
				}
				
				
			}
		}
		
		for(int i=x.length-1;i>0;i--)
		{
			System.out.print(";"+x[i]);
		}
	}

}
