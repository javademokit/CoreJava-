package Multithreading;
//Java program to explain the 
//concept of thread interference. 
import java.io.*; 

//Creating thread by creating the 
//objects of that class GFG
class GFG { 
	static int i=10; 
	void increment() 
	{ 
		for(int j=0;j<50;j++) 
		{ 
				// incrementing value of i 
			i=i+1; 
			System.out.println("i after increment "+i); 
		} 
	} 
	void decrement() 
	{ 
		for(int j=0;j<50;j++) 
		{ 
				// decrementing value of i 
			i=i-1; 
			System.out.println("i after decrement "+i); 
		} 
	} 
} 

class SharedClass { 
	public static void main(String[] args) 
	{ 
		final GFG s1 = new GFG(); 
		Thread t1 = new Thread() 
		{ 
			@Override
			public void run() 
			{ 
				s1.increment(); 
			} 
		}; 
		Thread t2 = new Thread() 
		{ 
			@Override
			public void run() 
			{ 
				s1.decrement(); 
			} 
		}; 
		t1.start(); 
		try
		{
			t1.join();
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start(); 
	} 
} 
