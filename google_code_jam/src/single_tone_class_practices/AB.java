package single_tone_class_practices;

public class AB
{
	public static void main(String args[])
	{
		
		int n=153;
		int sum=0;
		int r=0;
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(sum);
		
		
	}

}
