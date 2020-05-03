package datastructer;

public class Arrayarrange
{
	public static void main(String[] args)
	{
		int [] arr ={1,3,2,3,53,46};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
				int temp;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		
		for(int i=arr.length-1;i>0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
