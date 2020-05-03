package final_object;

//Java program to demonstrate that assignment
//operator only creates a new reference to same
//object.
import java.io.*;

//A test class whose objects are cloned
class Test
{
int x, y;
Test()
{
   x = 10;
   y = 20;
}
}

//Driver Class
class Main
{
public static void main(String[] args)
{
 /* final*/  Test ob1 = new Test();
 
    System.out.println(ob1.x + " " + ob1.y);
    
    
    Test ob2 = ob1;
    ob2.x = 100;
    
    System.out.println(ob1.x+" "+ob1.y);
    System.out.println(ob2.x+" "+ob2.y);
}
}