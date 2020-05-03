package Recursiveprogram;
public class sumofdigit
{  	public static void main(String[] args)
	{
	int num=1234;
	int revs=0;
	int r=0;
	int arm=0;
	int sumdigit=0;
	
	while(num>0)
	{
		r=num%10;
		sumdigit=sumdigit+r;
		//revs=(revs*10)+r;
		
		num=num/10;
	
	
	
	}
	//System.out.println(revs);
	System.out.println(sumdigit);
	}

}
