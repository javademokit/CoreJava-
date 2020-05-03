package Array2D;

public class Arrange_even_odd_array
{
	public static void main(String[] args)
	{
		
		
		System.out.println(1%2);
		
		System.out.println(1/2);
		
		int []arr= {1,2,3,4,5,6};
		int j=-1;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			j++;
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	for(int k=0;k<arr.length;k++)
	{
		System.out.print(arr[k]);
	}
		
	}

}
