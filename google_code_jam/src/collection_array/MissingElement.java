package collection_array;

public class MissingElement
{
	public static void main(String[] args) {
		 
	
		int[] arr2={5,3,1,2,9};
		System.out.println("Missing number from array arr2: "+missingNumber(arr2));
 
	}
 
	public static int missingNumber(int[] arr)
	{
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		int restSum=0;
		for (int i = 0; i <arr.length-1; i++) {
			restSum+=arr[i];
		}
		int missingNumber=sum-restSum;
		return missingNumber;
	}
}
