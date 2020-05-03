
public class A
{
public static void main(String args[])
{
	String s=new String("shyam");
	//String s3=new String("shyam");

	String s2=s.intern(); // create copy of exiting object---hashcode will be same
    
	System.out.println(s.hashCode()+": "+s2.hashCode());
	
    System.out.println(s==s2);
    System.out.print(s.equals(s2));
}
}
