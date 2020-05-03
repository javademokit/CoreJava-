package JOIN_Thread;

public class Trhradcontroller
{

	public static void main(String[] args) throws InterruptedException
	{
		Printcopy sb=new Printcopy();
		
		Thraed1 t1=new Thraed1(sb);
		Thread2 t2=new Thread2(sb);
		Thread3 t3=new Thread3(sb);
		Thread4 t4=new Thread4(sb);
		
		t1.start();
		t1.join();
		//t1.sleep(10000000);
		Thread.sleep(500);
		
		 
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		t4.start();
		t4.join();
		
		
		
	}
	
}
