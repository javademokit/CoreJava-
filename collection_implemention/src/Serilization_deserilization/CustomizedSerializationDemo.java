package Serilization_deserilization;
//Java program to illustrate loss of information 
//because of transient keyword. 
import java.io.*; 

class GfgAccount implements Serializable { 

	String username = "gfg_admin"; 

	transient String pwd = "geeks"; 

} 

class CustomizedSerializationDemo { 
	public static void main(String[] args) throws Exception 
	{ 
		GfgAccount gfg_g1 = new GfgAccount(); 

		System.out.println("Username : " + gfg_g1.username + 
								" Password : " + gfg_g1.pwd); 

		FileOutputStream fos = new FileOutputStream("abc.ser"); 

		ObjectOutputStream oos = new ObjectOutputStream(fos); 

		// writeObject() method present in GfgAccount class 
		// will be automatically called by jvm 
		oos.writeObject(gfg_g1); 

		FileInputStream fis = new FileInputStream("abc.ser"); 

		ObjectInputStream ois = new ObjectInputStream(fis); 

		// readObject() method present GfgAccount class 
		// will be automatically called by jvm 
		GfgAccount gfg_g2 = (GfgAccount)ois.readObject(); 

		System.out.println("Username : " + gfg_g2.username + 
							"	 Password : " + gfg_g2.pwd); 
	} 
} 
