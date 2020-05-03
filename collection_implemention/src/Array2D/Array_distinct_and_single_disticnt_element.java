package Array2D;

public class Array_distinct_and_single_disticnt_element
{
	
	public static void main(String[] args)
	{
		
		System.out.println("distcinct element----only");
		int []a= {1,2,3,2,4,5,7,7,6};
		int n=a.length;
		
		for(int i=0;i<n;i++)
		{
			int j;
			for(j=0;j<n;j++)
				if(a[i]==a[j])
					break;
			if(i==j)
				System.out.println(a[i]+"");
		}
		System.out.println("----------------new--");
		
		
		int []b= {1,2,3,2,4,5,7,7,6};
		int c=a.length;
		
		for(int i=0;i<c;i++)
		{
			int j;
			for(j=0;j<c;j++)
				if(i!=j&&b[i]==b[j])
					break;
			if(i==j)
				System.out.println(a[i]+"");
		}
		System.out.println();
		
	}
	

}
