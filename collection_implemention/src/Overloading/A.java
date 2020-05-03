package Overloading;

public class A
{
 public /*final*/ void sum(int a,int b)
 {
   System.out.println("sum is :"+(a+b)); 
 }
 
 public  double sum(int a, double b)
 {    
	 double c;
	 c=a+b;
	 System.out.println(c);
	return c;
	 
 }
public static void main(String[] agrs)
{
  A  a=new A();	
   a.sum(20,45);
   a.sum(12, 34.0);
}
	
}
