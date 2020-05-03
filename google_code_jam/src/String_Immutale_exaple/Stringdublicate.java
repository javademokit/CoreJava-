package String_Immutale_exaple;

public class Stringdublicate
{
	public static void main(String[] args)
	{
		String s1="shyam";
		      s1="Rishabh";
		      s1.concat("mohan");// we can not do chnage
		      s1=s1.concat("RishabhBinita");
		     System.out.println(s1); // RishabhRishabhBinita
		
		String s2=s1.concat("sonali");
		System.out.println(s2);
		String p1=new String("shyam");
		p1.concat("mohan");
		System.out.println(p1);
		 p1=p1.concat("mohan");
		System.out.println(p1);
		
		
		System.out.println("---------------------String assign");

		String t1="shyam";
	     t1="Rishabh";
	  System.out.println(t1);

	}

}
