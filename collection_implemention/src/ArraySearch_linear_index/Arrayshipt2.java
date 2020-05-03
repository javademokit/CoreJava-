package ArraySearch_linear_index;

public class Arrayshipt2
{
public static void main(String[] args)
{
	
	
	int arr[]= {1,2,4,5,6,7};
	
	int tmp1=arr[arr.length-1];
	int tmp2=arr[arr.length-2];
	
	for(int i=arr.length-1;i>1;i--)
	{
		arr[i]=arr[i-2];
	}
	
	arr[0]=tmp1;
	arr[1]=tmp2;
	for(int j=0;j<arr.length;j++)
	{
		System.out.println(arr[j]);
	}
	
	
	
}
}
