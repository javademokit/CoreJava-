package Datastructer_implementation_subset;

public class singledistrcint_element
{
	
	public static void main(String[] args)
	{
		int []arr= {1,1,2,3,3,2,6};
		
		for(int i=0;i<arr.length;i++)
		{
			int j;
			for(j=0;j<arr.length;j++)
			
				if(arr[i]==arr[j])
				
					break;
			    if(i==j)
				System.out.println(arr[i]);
				
				
				
			}
			
			
		}
		
		
		
	}


