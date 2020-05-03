package Arrayrotated;

public class rightshifttwoelement
{
	public static void main(String[] args)
	{
		int []arr ={1,2,5,6,7,3,9};
		
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
			
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
}
