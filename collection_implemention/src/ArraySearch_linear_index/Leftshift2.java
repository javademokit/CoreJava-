package ArraySearch_linear_index;

public class Leftshift2
{

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6};
		
		int tmp1=a[0];
		//int tmp2=a[1];
		for(int i=1;i<a.length;i++) {
			a[i-1]=a[i];
			
		}
		a[a.length-1]=tmp1;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
