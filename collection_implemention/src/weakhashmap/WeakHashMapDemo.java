package weakhashmap;
import java.util.*;
public class WeakHashMapDemo
{

	public static void main(String[] args) throws InterruptedException
	{
		
		WeakHashMap m=new WeakHashMap();
		Temp t=new Temp();
		m.put(t, "shyam");
		//System.out.println(m);
		t=null;
		System.gc();
	   Thread.sleep(5000);
	   System.out.println(m);
		
	   
		
	}
	
}

class Temp
{
	public String toString()
	{
		return "temp";
		
	}
	public void finalize()
	{
		System.out.println("finalize() method called");
	}
	
}
