package Railwaytrack;

public class customer
{
int amount=0;
int flag=0;
public  synchronized int withdraw(int amount)
{
	System.out.println(Thread.currentThread().getName()+"is going to withdraw");
	
	
	if(flag==0)
	{
		try
		{
			System.out.println("waiting .....");
			wait();
			
		}
		catch(Exception e)
		{
			//e.getMessage();
			e.printStackTrace();
		}
	}
	this.amount-=amount;
	System.out.println("widthdraw is completed-------");
	
	
	return amount;
	
}
public  synchronized void deposit(int amount)
{
	//System.out.println(Thread.currentThread().getName()+"is going to withdraw");
	
	System.out.println(Thread.currentThread().getName()+"going to deposite");
	notifyAll();
	this.amount+=amount;
	System.out.println("depsoite has done..");
	flag=1;
	//return amount
}
}
