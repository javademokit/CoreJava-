package Arrayrotated;

public class leftshifttwoelement
{
	public static void main(String[] args)
	{
		int[]arr={1,2,3,4,5,6};
		
		for(int i=2;i<arr.length;i++)
		{
			arr[i-2]=arr[i];
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
