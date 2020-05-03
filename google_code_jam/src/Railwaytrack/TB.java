package Railwaytrack;

public class TB extends Thread
{

	Railwaystationmonitersingletrain ts;
	
	 public TB(Railwaystationmonitersingletrain ts)
	 {
		 
		this.ts= ts;
		 
		 
	 }
	 public void run()
	 {
		 ts.station("2");
	 }
	
}
