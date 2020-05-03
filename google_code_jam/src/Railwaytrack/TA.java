package Railwaytrack;

public class TA extends Thread
{
	Railwaystationmonitersingletrain ts;
	
	 public TA(Railwaystationmonitersingletrain ts)
	 {
		 
		this.ts= ts;
		 
		 
	 }
	 public void run()
	 {
		 ts.station("1");
	 }
	
}
