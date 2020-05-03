package constrcution_chaining;

//Java program to illustrate Constructor Chaining 
//within same class Using this() keyword 
class Temp 
{ 
 // default constructor 1 
 // default constructor will call another constructor 
 // using this keyword from same class 
 Temp() 
 { 
     // calls constructor 2 
     this(5); 
     System.out.println("The Default constructor"); 
 } 

 // parameterized constructor 2 
 Temp(int x) 
 { 
     // calls constructor 3 
     this(5, 15); 
     System.out.println(x); 
 } 

 // parameterized constructor 3 
 Temp(int x, int y) 
 { 
     System.out.println(x * y); 
 } 

 public static void main(String args[]) 
 { 
     // invokes default constructor first 
     new Temp(); 
 } 
} 






/*

//Java program to illustrate Constructor Chaining 
//within same class Using this() keyword 
//and changing order of constructors 
class Temp 
{ 
 // default constructor 1 
 Temp() 
 { 
     System.out.println("default"); 
 } 

 // parameterized constructor 2 
 Temp(int x) 
 { 
     // invokes default constructor 
     this(); 
     System.out.println(x); 
 } 

 // parameterized constructor 3 
 Temp(int x, int y) 
 { 
     // invokes parameterized constructor 2 
     this(5); 
     System.out.println(x * y); 
 } 

 public static void main(String args[]) 
 { 
     // invokes parameterized constructor 3 
     new Temp(8, 10); 
 } 
} */
