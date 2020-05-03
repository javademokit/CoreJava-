package Datastructer_implementation_subset;

public class lastdublicateelemntinarray
{
	public static void main(String[] args)
	{
		int []arr={1,2,3,4,5,6,6,7,7};
		int n=arr.length;
		for(int i=n-1;i>0;i--)
		{
			if(arr[i]==arr[i-1])
			{
				System.out.println("index is:"+i+ ""+"dublicate element"+arr[i]);
				break;
			}
		}
	}
}
