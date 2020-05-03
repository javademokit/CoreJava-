package factorydesignp;

public class Factorymanager
{
	public static Shape getoject(String name)
	{
		
		if(name==null)
		{
			return null;
		}
		else if(name.equalsIgnoreCase("Circle"))
		{
			return new Circle();
		}
		else if(name.equalsIgnoreCase("Reactagle"))
		{
			return new Reactagle();
		}
		else if(name.equalsIgnoreCase("Trangle"))
		{
			return new Trangle();
		}
		return null;
		
	}

}
