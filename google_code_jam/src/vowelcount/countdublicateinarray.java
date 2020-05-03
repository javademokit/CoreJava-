package vowelcount;
/**
 * calculate total no of dublicate element in array...
 * @author binita yadav
 *
 */
public class countdublicateinarray
{
	public static void main(String[] args)
	{
		int []x={1,2,3,4,1,2,3,4};
		int count=0;
		for(int i=0;i<x.length;i++)
		{    
			int j=0;
			for( j=i+1;j<x.length;j++)
			{
				if(x[i]==x[j])
				{
					
					count=count+1;
					
				}
				
			}
			
			
		}
		System.out.println(count);
		
	}

}
