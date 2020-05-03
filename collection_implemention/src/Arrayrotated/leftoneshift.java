package Arrayrotated;

public class leftoneshift
{

	public static void main(String[] args)
	{
		int []arr={1,2,4,34,5,};
		
		for(int i=1;i<arr.length;i++)
		{
			arr[i-1]=arr[i];
		}
	
		
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
			
	}
}
