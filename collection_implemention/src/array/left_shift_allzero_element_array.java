package array;

public class left_shift_allzero_element_array
{
	public static void main(String[] args)
	{
		int a[]= {0,2,0,6,0,5,0,8};
		int j=-1;
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]==0)
			{
				j++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}

}
