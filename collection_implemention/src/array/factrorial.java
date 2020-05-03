package array;
import java.util.Scanner;


public class factrorial
{
	public static void main(String[] args)
	{
		System.out.println("hello ---");
		int a;
		int fact=1;
		Scanner kb=new Scanner(System.in);
		a=kb.nextInt();
		for(int i=1;i<=a;i++)
		{
			
			fact= fact*i;
			
		}
		System.out.println(fact);
		
		
	}
}


