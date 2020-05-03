package Array2D;

public class B_2sum
{
	public static void main(String[] args)
	{
		int [][]gradeTable={
				{99,42,74,83,100},
				{90,91,72,88,96},
				{88,61,74,89,96},
				{61,89,82,98,93},
				{93,73,75,78,99},
				{43,98,78,56,99}};
		
		
		System.out.println(gradeTable[0][0]);
		System.out.println(gradeTable[2][4]);
		gradeTable[5][3]=99;
		System.out.println(gradeTable[5][3]);
		int sum=gradeTable[0][1]+gradeTable[0][2];
		System.out.println(sum);
		
		
	}

}
