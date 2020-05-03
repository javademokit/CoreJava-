package print_odd_even_multithread;
class printmarksheet
{
	public void print(int from,int tak,String msg)
	{
		System.out.println("printing marksheet for---->"+msg);
		for(int i=from;i<=tak;i++) 
		{
			System.out.println(i);
		}
	}
}
class Teacher extends Thread
{
	printmarksheet t;
	Teacher(printmarksheet t)
	{
	   this.t=t;
	}
	public void run()
	{
		t.print(0, 4, "teacher");
	}
}
class Student extends Thread
{
	printmarksheet t;
	Student(printmarksheet t)
	{
		this.t=t;
	}
	public void run()
	{
    t.print(0, 20, "Student");
		
	}
}
public class JOIN_without_synchronization
{
public static void main(String[] args) throws InterruptedException
{
	printmarksheet shareresource=new printmarksheet();
	Teacher t=new Teacher(shareresource);
	Student s=new Student(shareresource);
	t.start();
	t.join();// it'll wait for first_thread complete the excution---
	s.start();
}
}
