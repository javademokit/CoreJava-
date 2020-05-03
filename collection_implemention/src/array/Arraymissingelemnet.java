package array;

public class Arraymissingelemnet
{
public static void main(String[] args)
{
	int []x={10,2,5,1,0,12,13,15,18,6};
	
	int max,min;
	max=min=x[0];
	
	for(int i=0;i<x.length;i++)
	{
		if(x[i]>max)
		{
			max=x[i];
		}
		if(x[i]<min)
		{
			min=x[i];
			
		}
	}
	boolean flag=false;
	
	for(int i=min+1;i<max;i++)
	{
	for(int j=0;j<x.length;j++)
	{
		if(i==x[j])
				{
			
			flag=true;
			break;
				}
	}
	

if(flag)
{
	flag=false;
	
}
else
{
	System.out.println(i +";");
}
}

}}
