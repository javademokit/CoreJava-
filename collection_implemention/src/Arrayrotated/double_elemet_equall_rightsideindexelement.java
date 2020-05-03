package Arrayrotated;
public class double_elemet_equall_rightsideindexelement
{
	public static void main(String[] args)
	{
	int[]x={1,4,2,5,6,8,25,4,15,1};
	int size=x.length;
	for(int i=0;i<x.length/2;i++)
	{
		if(x[i]*x[i]==x[(size--)-1])
		{
			System.out.println(i);
			
		}
		
	}
		
		
	}
}
