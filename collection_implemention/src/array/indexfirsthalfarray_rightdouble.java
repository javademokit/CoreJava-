package array;

public class indexfirsthalfarray_rightdouble
{

	public static void main(String[] args)
	{
		
		int []arr= {1,4,2,5,6,8,25,4,15,1};
		int size=arr.length;
		for(int i=0;i<arr.length/2;i++)
		{
			
			if(arr[i]*arr[i]==arr[(size--)-1])
			{
				System.out.println(arr[i]);
			}
		}
		
		
		
		
	}
}
