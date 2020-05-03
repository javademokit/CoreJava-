package array;

public class lefttwoshift {
	public static void main(String args[])
	{
		int x[]={1,2,3,4,5,6,7,8,9};
		for(int i=2;i<x.length;i++)
		{
			x[i-1]=x[i];
		}
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
	}
	

}
