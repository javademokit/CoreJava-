package construction_copy;
public class COPY
{
	String name;
	int id;
	public COPY(String name, int id)
	{
		super();
		this.name = name;
		this.id = id;
	}
	COPY(COPY p)
	{
		this.id=p.id;
		this.name=p.name;
	}
	public static void main(String[] args)
	{
		COPY s=new COPY("shyam",2);
		System.out.println(s.name);
		COPY b=new COPY(s);
		System.out.println(b.id);
	}
}
