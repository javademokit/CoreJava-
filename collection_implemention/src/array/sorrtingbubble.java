 package array;

public class sorrtingbubble {
	public static void main(String args[])
	{
		int []x={10,2,2,2,1,1,5,5,3,13,7,20,15};
		
		System.out.println("affter sorrting");
		for(int i=0;i<x.length-1;i++)
		{
		for(int j=0;j<x.length-1;j++)
		{
			if(x[j]>x[j+1])
			{
				int y=x[j];
				x[j]=x[j+1];
				x[j+1]=y;
			}
		}
	}
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
	}
	

}
