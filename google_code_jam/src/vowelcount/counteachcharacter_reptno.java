package vowelcount;
import java.util.Scanner;

public class counteachcharacter_reptno
{
	public static void main(String[] args)
	{ 
		 int count =0;
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		for(char i='a';i<='z';i++)
		{
		for(int j=0;j<s.length();j++)
		{
		if(s.charAt(j)==i)
		{
		count++;
		}
		}
		if(count!=0)
		{
		System.out.println(i+"="+count);
		count=0;
		}
		}
		}
		
	}

