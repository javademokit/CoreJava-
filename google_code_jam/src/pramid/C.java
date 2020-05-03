package pramid;

public class C
{
public static void main(String[] args)
{
	
	String s;
	int row=11;
	int odd=1;
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=(row-i);j++)
		{
			System.out.print("");
		}
		
		for(int k=1;k<=odd;k++)
		{
			System.out.print("*");
		}
		System.out.println();
		odd+=2;
	}
}
}
