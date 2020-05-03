package array;

public class shiftzerorightside
{
public static void main(String[] args)
{
	int a[]= {1,0,4,0,2,0,8,9,7};
	int j=-1;
	 for(int i=0;i<a.length;i++)
	 {
		if(a[i]!=0)
		{
			j++;
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	 }
	 
	 for(int i=0;i<a.length;i++)
	 {
		 System.out.println(a[i]);
	 }
}
}
