package longgestString_in_array;


public class Arrangename
{
	public static void main(String[] args)
	{
    String s="shyamm";
    char []arr=s.toCharArray();
    
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=i+1;j<arr.length;j++)
    	{
    		if(arr[i]>arr[j])
    		{
    			char c=arr[i];
    			
    			arr[i]=arr[j];
    			arr[j]=c;
    			
    			
    		}
    	}
    }
    for(char ss:arr)
    {
    	System.out.print(ss);
    }
  
  
}
}