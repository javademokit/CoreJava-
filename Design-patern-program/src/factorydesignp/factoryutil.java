package factorydesignp;

public class factoryutil
{
public static void main(String[] args)
{
	
	
	Shape sp=Factorymanager.getoject("Circle");
	sp.draw();
	Shape sp1=Factorymanager.getoject("Reactagle");
	sp1.draw();
	Shape sp2=Factorymanager.getoject("Trangle");
	sp2.draw();
	
	
}
}
