package Railwaytrack;

public class TE extends Thread
{
	Railwaystationmonitersingletrain ts;
	
	 public TE(Railwaystationmonitersingletrain ts)
	 {
		 
		this.ts= ts;
		 
		 
	 }
	 public void run()
	 {
		 ts.station("5");
	 }
}
