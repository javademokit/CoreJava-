package ArraySearch_linear_index;

public class Missingelement
{

	public static void main(String[] args)
	{
		
		int []x= {1,3,4,5,6,8,9};
		int min,max;
		min=max=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>max)
			{
				max=x[i];
			}
		}
		for(int j=0;j<x.length;j++)
		{
			if(x[j]<min)
			{
				min=x[j];
			}
		}
		boolean flag=false;
		
		for(int i=min+1;i<max;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				if(i==x[j])
				{
					flag=true;
					break;
				}
			}
			if(flag)
			{
				flag=false;
			}
			else
			{
				System.out.println(i+"");
			}
		}
	}
}
