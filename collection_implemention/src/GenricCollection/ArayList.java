package GenricCollection;

public class ArayList<T>
{
	private T obj;
	
	ArayList(T obj)
	{
		this.obj=obj;
	}
	private T get()
	{
		return this.obj;
	}
	
	public static void main(String[] args)
	{
		
		ArayList<String>ls =new ArayList<String>("shyam");
		System.out.println(ls.get());
		
	}
	
	
	
	
	

}
