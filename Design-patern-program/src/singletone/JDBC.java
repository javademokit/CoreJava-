package singletone;

public class JDBC
{
	/*
	 * #loading type 
	 *  1. early loading 
	 *  2. lazy loading 
	 */
private JDBC()
{
	
	
}
private  static  JDBC object=null;

public static JDBC getInstance()
{
	
	if(object==null)
	{
		object= new JDBC();
	}
	return object;
	
}
public static void main(String[] args)
{
	for(int i=0;i<5;i++)
	{
		System.out.println(JDBC.getInstance().hashCode());
	}
}

}
