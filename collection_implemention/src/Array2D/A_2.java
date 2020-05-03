package Array2D;

public class A_2
{
	public static void main(String[] args)
	{
		int [][]uneven={{1,9,4},{0,2},{0,1,2,3,4}};
		/*
		System.out.println(uneven.length);
		System.out.println(uneven[0][0]);//first
		System.out.println(uneven[1][0]);//two
		System.out.println(uneven[2][0]);//third
		System.out.println("--------------------------");
	System.out.println("leanth of row[0]:"+uneven[0].length);
	System.out.println("leanth of row[1]:"+uneven[1].length);
	System.out.println("leanth of row[2]:"+uneven[2].length);*/
	int sum=0;
	
	
	for(int row=0;row<uneven.length;row++)
	{
		System.out.println("row is :"+row);
		
		for(int coln=0;coln< uneven[row].length;coln++)
		{
			System.out.println(uneven[row][coln]);
			
		}
		
	}
		
		
	System.out.println("-------second way---------------");
	
	
	
	int sum1=0;
	int x,y;
	int []second;
   for(x=0;x<uneven.length;++x)
   {
	    second=uneven[x];
	    for(y=0;y<second.length;++y)
	    {   
	    	System.out.println(x+","+y+";"+second[y]);
	    	
	    	sum1+=second[y];
	    }
	    System.out.println("sum is :"+sum1);
	    sum1=0;
   }
	


}
}
