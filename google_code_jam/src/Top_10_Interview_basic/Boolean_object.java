package Top_10_Interview_basic;
public class Boolean_object
{
	public static void main(String[] args)
	{
		String s=new String("shyam");
		s+="mohan";// create new object---- // o/p  mohan// with + shyammohan
		System.out.println(s);
		String s1=new String("shyam");
		System.out.println(s1.equals(s));
		Boolean t1=new Boolean();
		Boolean t2=new Boolean();
		System.out.println(t1.equals(t2));
	}
}
