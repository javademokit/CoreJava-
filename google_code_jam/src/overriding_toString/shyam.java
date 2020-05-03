package overriding_toString;

public class shyam
{
	
String name;
int id;


	
public shyam(String name, int id)
{
	super();
	this.name = name;
	this.id = id;
}



@Override
public String toString()
{
	return "shyam [name=" + name + ", id=" + id + "]";
}



public static void main(String[] args)
{
	
	shyam sb=new shyam("soghan",12);
	shyam sb1=new shyam("soghan",12);

	System.out.println(sb);
	System.out.println(sb1);

	
	
}
	
	
	
}
