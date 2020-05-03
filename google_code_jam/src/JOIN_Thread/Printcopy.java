package JOIN_Thread;

public class Printcopy
{

	
	public synchronized void  print(String msg,int n) throws InterruptedException
	{
		
		System.out.println("print copy for given input------->"+msg);
		
		
		for(int i=0;i<=n;i++)
		{
			
			
			System.out.println(i);
			notify();
		}
		
		
		
		
	}
	
}
