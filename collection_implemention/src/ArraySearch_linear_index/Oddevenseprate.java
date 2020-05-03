package ArraySearch_linear_index;

public class Oddevenseprate
{

	public static void main(String[] args)
	{
		
		int []x= {1,2,3,4,5,6,7,8,9,10,20};
		int j=-1;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2==0)
			{
				j++;
				int tmp=x[i];
				x[i]=x[j];
				x[j]=tmp;
			}
		}
		
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		
	}
	
	
}
