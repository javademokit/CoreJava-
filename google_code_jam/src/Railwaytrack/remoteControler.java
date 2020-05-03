package Railwaytrack;

public class remoteControler
{
public static void main(String[] args)
{
	Railwaystationmonitersingletrain st=new Railwaystationmonitersingletrain();
	
	TA t1=new TA(st);
	TB t2=new TB(st);
	TC t3=new TC(st);
	TD t4=new TD(st);
	TE t5=new TE(st);
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();

	
	


	
}
}
