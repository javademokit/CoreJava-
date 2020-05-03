package Externalization;

//Java program to demonstrate working of Externalization interface 
import java.io.*; 
class Car implements Externalizable { 
	static int age; 
	String name; 
	int year; 

	public Car() 
	{ 
		System.out.println("Default Constructor called"); 
	} 

	Car(String n, int y) 
	{ 
		this.name = n; 
		this.year = y; 
		age = 10; 
	} 
	public void writeExternal(ObjectOutput out) 
							throws IOException 
	{ 
		out.writeObject(name); 
		out.writeInt(age); 
		out.writeInt(year); 
	} 
	public void readExternal(ObjectInput in) 
	throws IOException, ClassNotFoundException 
	{ 
		name = (String)in.readObject(); 
		year = in.readInt(); 
		age = in.readInt(); 
	} 
	public String toString() 
	{ 
		return ("Name: " + name + "\n" + 
			"Year: " + year + "\n" + 
			"Age: " + age); 
	} 
} 

public class ExternExample { 
	public static void main(String[] args) 
	{ 
		Car car = new Car("Shubham", 1995); 
		Car newcar = null; 

		// Serialize the car 
		try { 
			FileOutputStream fo = new FileOutputStream("gfg.txt"); 
			ObjectOutputStream so = new ObjectOutputStream(fo); 
			so.writeObject(car); 
			so.flush(); 
		} 
		catch (Exception e) { 
			System.out.println(e); 
		} 

		// Deserializa the car 
		try { 
			FileInputStream fi = new FileInputStream("gfg.txt"); 
			ObjectInputStream si = new ObjectInputStream(fi); 
			newcar = (Car)si.readObject(); 
		} 
		catch (Exception e) { 
			System.out.println(e); 
		} 

		System.out.println("The original car is:\n" + car); 
		System.out.println("The new car is:\n" + newcar); 
	} 
} 
