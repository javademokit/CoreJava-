package Railwaytrack;

public class TD extends Thread
{
	Railwaystationmonitersingletrain ts;
	
	 public TD(Railwaystationmonitersingletrain ts)
	 {
		 
		this.ts= ts;
		 
		 
	 }
	 public void run()
	 {
		 ts.station("4");
	 }
}
