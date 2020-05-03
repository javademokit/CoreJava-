package twointerfcae;

//JAVA program to illustrate the behavior 
//of program when two interfaces having same 
//methods and different return-type 
interface bishal 
{ 
	
	int a=30;
	
public
	void show(); 
} 

interface geeks 
{ 
//	int a=7;
public
	int show1(); 
} 

class Test implements bishal, geeks 
{ 
	public void show() // Overloaded method based on return type, Error 
	{ 
	} 
	public int show1() // Error 
	{ 
		return 1; 
	} 
public static void main(String args[]) 
	{ 
	
	
	System.out.println(a);
	} 
} 
