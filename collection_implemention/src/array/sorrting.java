package array;

public class sorrting {
	public static void main(String[] args) 
	{
	    int a[]={3,2,1,4,2,1,-1};
	   
	    for(int i=0;i<a.length;i++)
	    {
	        for(int j=i;j<a.length;j++)
	        {
	            if(a[i]>a[j])
	            {
	            int temp=a[i];
	            a[i]=a[j];
	            a[j]=temp;
	            }

	        }
	    }
	    for(int i=0;i<a.length;i++)
	    {
	        System.out.print(a[i]+",");
	    }

	}
}





