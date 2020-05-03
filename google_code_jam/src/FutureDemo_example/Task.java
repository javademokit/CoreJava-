package FutureDemo_example;

public class Task implements Runnable
{

	public void do_stuff()
	{
		System.out.println("hello");
	}
	public void run()
	{
		do_stuff();
		
	}
	public static void main(String args[])
	{
		Thread [] tastarr= {new Thread(new Task()),
				            new Thread(new Task()), 
				            new Thread(new Task()),
				            new Thread(new Task()),
				            new Thread(new Task())
		                   };
		/*		           };
		tastarr[0].start();
		tastarr[1].start();
		tastarr[2].start();
		tastarr[3].start();
		tastarr[4].start();*/
     System.out.println("done---");
     
     for(Thread t:tastarr)
     {
    	t.start(); 
     }



		
	}
}
