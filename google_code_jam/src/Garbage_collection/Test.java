package Garbage_collection;

//Java program to demonstrate requesting  
//JVM to run Garbage Collector 
public class Test 
{ 
 public static void main(String[] args) throws InterruptedException 
 { 
     Test t1 = new Test(); 
     Test t2 = new Test(); 
       
     // Nullifying the reference variable 
     t1 = null; 
       
     // requesting JVM for running Garbage Collector 
     System.gc(); 
       
     // Nullifying the reference variable 
     t2 = null; 
       
     // requesting JVM for running Garbage Collector 
     Runtime.getRuntime().gc(); 
   
 } 
   
 @Override
 // finalize method is called on object once  
 // before garbage collecting it 
 protected void finalize() throws Throwable 
 { 
     System.out.println("Garbage collector called"); 
     System.out.println("Object garbage collected : " + this); 
 } 
} 
