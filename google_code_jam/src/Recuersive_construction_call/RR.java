package Recuersive_construction_call;

//Java program to illustrate recursive  
//constructor call not allowed 

class RR { 
 RR() 
 { 
     //this(30); 
 } 
 RR(int a) 
 { 
     this(); //compile time error
 } 
 public static void main(String[] args) 
 { 
     new RR(); 
 } 
}




/*


Q5. Can you override a private or static method in Java?
You cannot override a private or static method in Java. If you create a similar method with same return type and same method arguments in child class then it will hide the super class method; this is known as method hiding. Similarly, you cannot override a private method in sub class because it’s not accessible there. What you can do is create another private method with the same name in the child class. Let’s take a look at the example below to understand it better.
*/