package Garbage_collection;

//filename: Main.java 

class Complex1 { 

 private double re, im; 
   
 // A normal parametrized constructor  
 public Complex1(double re, double im) { 
     this.re = re; 
     this.im = im; 
 } 
   
 // copy constructor 
 Complex1(Complex1 c) { 
     System.out.println("Copy constructor called"); 
     re = c.re; 
     im = c.im; 
 } 
    
 // Overriding the toString of Object class 
 @Override
 public String toString() { 
     return "(" + re + " + " + im + "i)"; 
 } 
} 

public class Complex { 

 public static void main(String[] args) { 
     Complex1 c1 = new Complex1(10, 15); 
       
     // Following involves a copy constructor call 
     Complex1 c2 = new Complex1(c1);    

     // Note that following doesn't involve a copy constructor call as  
     // non-primitive variables are just references. 
     Complex1 c3 = c2;    

     System.out.println(c2); // toString() of c2 is called here 
 } 
} 