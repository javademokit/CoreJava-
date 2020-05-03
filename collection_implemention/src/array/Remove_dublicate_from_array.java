package array;

public class Remove_dublicate_from_array
{
	public static void main(String[] args)
	{
		int []arr={10,20,30,20,40,40,50,60,70,80,80,90,10,20};
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					while(j<(size)-1)
					{
						arr[j]=arr[j+1];
						j++;
					}
					size--;
				}
			}
		}
		for(int k=0;k<size;k++)
		{
			System.out.println(arr[k]);
		}
	}

}
