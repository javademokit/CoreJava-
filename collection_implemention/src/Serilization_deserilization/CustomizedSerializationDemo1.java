package Serilization_deserilization;
//Java program to illustrate customized serialization 
import java.io.*; 

class GfgAccount1 implements Serializable { 

	String username = "gfg_admin"; 

	transient String pwd = "geeks"; 

	// Performing customized serialization using the below two methods: 
	// this method is executed by jvm when writeObject() on 
	// Account object reference in main method is 
	// executed by jvm. 
	private void writeObject(ObjectOutputStream oos) throws Exception 
	{ 
		// to perform default serialization of Account object. 
		oos.defaultWriteObject(); 

		// epwd (encrypted password) 
		String epwd = "123" + pwd; 

		// writing encrypted password to the file 
		oos.writeObject(epwd); 
	} 

	// this method is executed by jvm when readObject() on 
	// Account object reference in main method is executed by jvm. 
	private void readObject(ObjectInputStream ois) throws Exception 
	{ 
		// performing default deserialization of Account object 
		ois.defaultReadObject(); 

		// deserializing the encrypted password from the file 
		String epwd = (String)ois.readObject(); 

		// decrypting it and saving it to the original password 
		// string starting from 3rd index till the last index 
		pwd = epwd.substring(3); 
	} 
} 

class CustomizedSerializationDemo1 { 
	public static void main(String[] args) throws Exception 
	{ 
		GfgAccount1 gfg_g1 = new GfgAccount1(); 

		System.out.println("Username :" + gfg_g1.username + 
						"	 Password :" + gfg_g1.pwd); 

		FileOutputStream fos = new FileOutputStream("abc.ser"); 

		ObjectOutputStream oos = new ObjectOutputStream(fos); 

		// writeObject() method on Account class will 
		// be automatically called by jvm 
		oos.writeObject(gfg_g1); 

		FileInputStream fis = new FileInputStream("abc.ser"); 

		ObjectInputStream ois = new ObjectInputStream(fis); 

		GfgAccount1 gfg_g2 = (GfgAccount1)ois.readObject(); 

		System.out.println("Username :" + gfg_g2.username + 
							"	 Password :" + gfg_g2.pwd); 
	} 
} 
