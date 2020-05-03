package Railwaytrack;

public class TC extends Thread
{
	Railwaystationmonitersingletrain ts;
	
	 public TC(Railwaystationmonitersingletrain ts)
	 {
		 
		this.ts= ts;
		 
		 
	 }
	 public void run()
	 {
		 ts.station("3");
	 }
	
}
