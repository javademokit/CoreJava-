package array;

public class oddindex {
	public static void main(String args[])
	{
		int[]x={12,77,9,9,9,6,5};
		for(int i=1;i<x.length;i+= 2)
		{
			System.out.println(x[i]);
		}
		System.out.println("-----------");
		
		
		for(int i=0;i<x.length;i+= 2)
		{
			System.out.println(x[i]);
		}
	}

}
