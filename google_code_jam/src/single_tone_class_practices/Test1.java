package single_tone_class_practices;
class superclass implements Cloneable
{
	int a=10;
	@Override
	protected Object clone() throws  CloneNotSupportedException 
	{
		return super.clone();
		
	}
	
}
class singletone  extends superclass
{		
	public  static final singletone instance =new singletone();
		
	private singletone()
	{
		
	}
	@Override
	protected Object clone() throws  CloneNotSupportedException 
	{
		return instance;
		//return new  CloneNotSupportedException();
		
	}
}
public class Test1
{

	public static void main(String args[]) throws CloneNotSupportedException
	{
		singletone instance1=singletone.instance;
		
		singletone instance2=(singletone)instance1.clone();
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		
		System.out.println(1%10);
		System.out.println(1/10);
		
	}
}
