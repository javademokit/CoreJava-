package JOIN_Thread;

public class Thread2 extends Thread
{

	Printcopy  Printcopy;
	
	Thread2(Printcopy Printcopy)
	{
		this.Printcopy=Printcopy;
	}
	
	public void run()
	{
		try
		{
			Printcopy.print("B", 3);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
