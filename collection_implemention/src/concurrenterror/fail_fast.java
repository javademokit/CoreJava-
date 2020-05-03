package concurrenterror;

import java.util.HashMap;
import java.util.Map;

/*Fail Fast
When you perform add, update or remove on collection while iterating on it. It throws java.util.ConcurrentModificationException.

Source code (FailFastExample.java)*/
public class fail_fast
{
	 public static void main(String[] args) {
	        Map<String, Double> carPrice = new HashMap<String, Double>();
	        carPrice.put("Porsche", 100000D);
	        carPrice.put("Ferrari", 200000D);
	 
	        /* Iterate over Map */
	        for(Map.Entry<String, Double> car : carPrice.entrySet()){
	            System.out.println("Car: " + car.getKey());
	            System.out.println("Price: " + car.getValue());
	            
	            /* Will cause java.util.ConcurrentModificationException */
	            carPrice.put("Lamborghini", 300000D);
	        }
	    }
}
