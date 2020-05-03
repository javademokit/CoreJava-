package static_keyword;
class c
{
 
 static int a;
 
 static
 {
	 
  System.out.println("static---");
  a=10;// non static we can not access--
 }
 c()
 {
  System.out.println("constrcution---");
  a=4; // last value--
  //a=a+4;; // it will add---
 }
 
public static void show()
{
 P b=new P();
 System.out.println(a);
}
 
 
}

public class A extends P{
 public static void main(String[] args) {
  
  
  
  show();
 }
 

}