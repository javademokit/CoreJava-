package array;

public class leftoneshift {
	public static void main(String args[])
	{
		int x[]={1,2,3,4,5};
		for(int i=1;i<x.length;i++)
		{
			x[i-1]=x[i];
		}
		
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]);
		}
	}

}
