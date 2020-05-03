package ArraySearch_linear_index;

public class Search_Element_index_no
{

	public static String search (int []x, int y)
	{
		
		int index=-1  ;
		for(int i=0;i<x.length;i++)
		{
			
			if(x[i]==y)
			{
			
				index=i;
				break;
			}
			
		}
		return "Number  fund at index no:"+index;
		
		
		
	}
	public static void main(String[] args)
	{
		
		
		int []x={12,23,2,2,3,4,5,6,9};
		String j=search(x,9);
		System.out.println(j);
		
		
		
	}      

	
	
}
