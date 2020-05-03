/**
 * 
 * @author Shyamlal yadav
 *
 */
package Array2D;

public class Mergarray_sortarray
{
	static int count=0;
public static void main(String[] args)
{
	int []arr1= {1,3,2,5,6,8};
	int []arr2= {2,3,56,7,8};
	
	int []merg1=getarray(arr1,arr2);
	for(int l:merg1)
	{
		System.out.println(l);
	}
}
public static  int[] getarray(int[]arr1,int []arr2)
{
	int []merg=new int[arr1.length+arr2.length];
	   for(int i=0;i<arr1.length;i++)
	   {
		   merg[i]=arr1[i];
		   count++;
	   }
	   for(int j=0;j<arr2.length;j++)
	   {
		   merg[count++]=arr2[j];
	   }
	   
	   // for  shorting perpose---- 
	
	for(int k=0;k<merg.length;k++)
	{
		for(int l=k+1;l<merg.length;l++)
		{
			if(merg[k]>merg[l])
			{
				int temp=merg[k];
				merg[k]=merg[l];
				merg[l]=temp;
				
			}
		}
	}
	
	return merg;
	
}
}
