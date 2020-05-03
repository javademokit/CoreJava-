package Interface;

class TestInterface4 implements Showable
{  
	@Override
public void print()
	{System.out.println("Hello");
	}
	@Override
public void show()
	{
		System.out.println("Welcome");
		
	}  
  
public static void main(String args[]){  
TestInterface4 obj = new TestInterface4();  
obj.print();  
obj.show();  
 }  
}  
