package JOIN_Thread;

public class Thread4 extends Thread
{

	Printcopy  Printcopy;
	
	Thread4(Printcopy Printcopy)
	{
		this.Printcopy=Printcopy;
	}
	
	public void run()
	{
		try
		{
			Printcopy.print("D", 5);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
