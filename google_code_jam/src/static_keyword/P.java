package static_keyword;

class D
{
 
 static int a;
 
 static
 {
  System.out.println("static---");
  a=10;
 }
 D()
 {
  System.out.println("constrcution---");
  
  a=a+4;;
 }
 
public static void show()
{
 System.out.println(a);
}
 
 
}

public class P extends D{
 public static void main(String[] args) {
  
  
  
  show();
 }
 

}