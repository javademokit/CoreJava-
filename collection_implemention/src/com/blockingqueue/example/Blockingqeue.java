package com.blockingqueue.example;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Blockingqeue
{
	
	 public static void main(String[] args)  throws InterruptedException 
		    { 
		 
		 BlockingDeque<String> BD1 
         = new LinkedBlockingDeque<String>(); 
		  
		        // create object of BlockingDeque 
		        BlockingDeque<Integer> BD 
		            = new LinkedBlockingDeque<Integer>(); 
		  
		        // Add numbers to end of BlockingDeque 
		        BD.add(7855642); 
		        BD.add(35658786); 
		        BD.add(5278367); 
		        BD.add(74381793); 
		  
		        // print Deque 
		        System.out.println("Blocking Deque: " + BD); 
		  
		        // removes the front element and prints it 
		        System.out.println("Head of Blocking Deque: "
		                           + BD.takeFirst()); 
		  
		        // prints the Deque 
		        System.out.println("Blocking Deque: " + BD); 
		    } 
}
