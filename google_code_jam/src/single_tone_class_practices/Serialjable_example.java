package single_tone_class_practices;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class mysingletone implements Serializable{
	
public static mysingletone instance=new mysingletone();
	private mysingletone()
	{
		
	}
	protected Object ReadResolved()
	{
		
		
		return instance;
		
	}
	
	
}
public class Serialjable_example  
{
public static void main(String args[])
{
	try
	{
		mysingletone instance1=mysingletone.instance;
		
		ObjectOutput out= new ObjectOutputStream(new FileOutputStream("C://Users//binita yadav//Desktop//app.txt"));
		out.writeObject(instance1);
		out.close();
		
		ObjectInput input= new ObjectInputStream(new FileInputStream("C://Users//binita yadav//Desktop//app.txt"));
		
		mysingletone instance2=(mysingletone)input.readObject();
		
		input.close();
		
		System.out.println("instance1 hascode "+instance1.hashCode());
		System.out.println("instance2 hascode "+instance2.hashCode());

	}
	catch(Exception e)
	{
		
	}
}
}
