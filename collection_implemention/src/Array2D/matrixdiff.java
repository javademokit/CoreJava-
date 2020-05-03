package Array2D;

public class matrixdiff
{
 static String s="shyam";
	
 static int a=78;
	static int sum=0;
	public static void main(String[] args)
	{
		s="rohan";
		System.out.println(matrixdiff.s);
		String s="mohan";
		String s1=a+s;
		System.out.println(s1);
	
		int [][]uneven={{1,9},{4,2},{5,1}};
		
		for(int i=0;i<uneven.length;i++)
		{
			System.out.println("input"+i);
			for(int j=0;j<uneven[i].length;j++)
			{
				System.out.println(uneven[i][j]);
				sum+=uneven[i][j];
			}
			System.out.println("sum is :"+sum);
			sum=0;
		}
		
		
		
		
		
	}
}
