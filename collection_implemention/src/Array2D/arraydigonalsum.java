package Array2D;
/**
 * sum of digonal array left digonal and riht digonal 
 */
import thread.mainclass;

public class arraydigonalsum
{
public static void main(String[] args)
{

	int [][]arr={
			{99,42,74,83,1},
			{90,91,72,88,96},
			{88,61,74,89,96},
			{61,89,82,98,93},
			{93,73,75,78,99},
	};
	
	int rightdl=0;
	for(int i=0;i<arr.length;i++)
	{
		rightdl=rightdl+arr[i][i];
	}
	
	System.out.println("sum of right digonal:"+rightdl);
	
	int lefttdl=0;
	for(int i=0;i<arr.length;i++)
	{
		lefttdl=lefttdl+arr[arr.length-1-i][i];
	}
	System.out.println("sum of left digonal:"+lefttdl);
}
	


}

