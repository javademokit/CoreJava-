package array;

//Java program to find missing Number 

class Main { 
	// Function to ind missing number
	
	static int getMissingNo(int a[], int n) 
	{ 
	
		int i, total; 
		total = (n + 1) * (n + 2) / 2; 
		for (i = 0; i < n; i++) 
			total -= a[i]; 
		return total; 
	} 

	/* program to test above function */
	public static void main(String args[]) 
	{ 
		int a[] = { 1, 2, 4, 5, 6 }; 
		int miss = getMissingNo(a, 5); 
		System.out.println(miss); 
		ap();
	} 
	
	public static void ap()
	{
		
		int []a= {1,4,3,5,2};
		
		for(int i=1;i<a.length-1;i++)
		{
			if(a[i]>a[i-1])
			{
				int temp=a[i];
				a[i]=a[i-1];
				a[i-1]=temp;
				
			}
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]);
		}
	}
	
	
} 

