package pramid;

public class B
{
	public static void main(String[] args)
	{
		
		for(int i=5;i>0;i--)
		{
			int  a=0;
			for(int j=0;j<i;j++)
			{
				if(i%2==0)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print("+");
				}
			}
			System.out.println();
		}
	}

}
