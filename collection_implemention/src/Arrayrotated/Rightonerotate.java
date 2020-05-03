package Arrayrotated;


@SuppressWarnings("unused")
public class Rightonerotate
{
public static void main(String[] args)
{
	int []arr={1,2,4,34,5,};
	int temp=arr[arr.length-1];
	for(int i=arr.length-1;i>0;i--)
	{
		arr[i]=arr[i-1];
	}
	arr[0]=temp;
	
	for(int k=0;k<arr.length;k++)
	{
		System.out.println(arr[k]);
	}
}

}
