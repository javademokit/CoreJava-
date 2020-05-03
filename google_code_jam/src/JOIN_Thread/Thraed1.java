package JOIN_Thread;

public class Thraed1 extends Thread
{
	
	Printcopy  Printcopy;
	
	Thraed1(Printcopy Printcopy)
	{
		this.Printcopy=Printcopy;
	}
	
	public void run()
	{
		try
		{
			Printcopy.print("A", 2);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
