package Interfacev3;

//if you don't want to implement interface make class as abstract
public /*abstract */class AB implements A,B
{
public static void main(String[] args)
{
	System.out.println(A.x);
	System.out.println(B.x);
	// System.out.println(x); // which x?
}

@Override
public void call()
{
	// TODO Auto-generated method stub
	
}

@Override
public void show()
{
	// TODO Auto-generated method stub
	
}
}
