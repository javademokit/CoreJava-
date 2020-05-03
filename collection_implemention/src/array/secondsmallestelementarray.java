package array;

public class secondsmallestelementarray
{
	public static void main(String[] args)
	{
		int []arr={1,12,34,5,6,78,90,23,54,2,-1};
		int secondsmall=arr[0];
		int smallest=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i] > smallest) {
				secondsmall = smallest;
				smallest= arr[i];

			} else if (arr[i] < secondsmall) {
				secondsmall = arr[i];

			} 
		}
          
		System.out.println("\nsecondsmall is:" + secondsmall);

	}

		
	}


