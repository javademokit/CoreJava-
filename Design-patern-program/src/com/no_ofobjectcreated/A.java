package com.no_ofobjectcreated;

public class A
{
static int a=0;


public A()
{
	
	
}


public A(int a)
{
	
	
}
{
	a++;
	System.out.println("i'm static block");
}
	public static void main(String args[])
	{
		A a=new A();
		A a1=new A();
		A a2=new A(10);

	System.out.println(A.a);
	}
	
}
