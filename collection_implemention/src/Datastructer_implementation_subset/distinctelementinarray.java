package Datastructer_implementation_subset;

public class distinctelementinarray
{
public static void main(String[] args)
{
	int []arr={10,2,30,30,4,6,70,70,80,80,6,7,90,90};
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

