package Railwaytrack;
public class Threadcom
{
	public static void main(String[] args)
	{
		final customer c=new customer();
		Thread t1=new Thread()
		{
			public void run()
			{
				c.withdraw(2000);
				System.out.println("widhraw amount is "+c.amount);
			}
		};
		Thread t2=new Thread()
		{
			public void run()
			{
				c.deposit(100);
				System.out.println("deposite amount is"+c.amount);
			}
			
	    };
	    t1.start();
	    t2.start();
	}
}
