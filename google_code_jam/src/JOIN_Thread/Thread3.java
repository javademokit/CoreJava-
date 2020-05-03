package JOIN_Thread;

public class Thread3 extends Thread
{

	Printcopy  Printcopy;
	
	Thread3(Printcopy Printcopy)
	{
		this.Printcopy=Printcopy;
	}
	
	public void run()
	{
		try
		{
			Printcopy.print("C", 4);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
