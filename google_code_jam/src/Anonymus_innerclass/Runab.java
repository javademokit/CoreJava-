package Anonymus_innerclass;

class p extends Thread
{
	
}


public class Runab implements Runnable 
{
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		Runab s=new Runab();
		Runab s1=new Runab();

		/*Thread t=new Thread(s);
		Thread t1=new Thread(s);*/
/*
		t.start();
		t1.start();*/
		
		
		s.run();
		s1.run();
	}

}
