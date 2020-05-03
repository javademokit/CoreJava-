package array;

public class rtshift {
public static void main(String args[])
{
	int[]x={1,2,3,4,5};
	
	System.out.println(x.length);
	for(int i=x.length-1;i>1;i--)
	{
		x[i]=x[i-2];
	}
	for(int i=0;i<x.length;i++)
	{
		System.out.print(x[i]);
	}
	
}
}
