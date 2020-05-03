package concurrenterror;
/*Fail Safe
It iterate over the clone(copy) of original collection. So It won't throw java.util.ConcurrentModificationException.

Source code (FailSafeExample.java)*/
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class fail_safe
{
	
	 public static void main(String[] args) {
	        Map<String, Double> carPrice = new ConcurrentHashMap<String, Double>();
	        carPrice.put("Porsche", 100000D);
	        carPrice.put("Ferrari", 200000D);
	 
	        /* Iterate over Map */
	        for (Map.Entry<String, Double> car : carPrice.entrySet()) {
	            System.out.println("Car: " + car.getKey());
	            System.out.println("Price: " + car.getValue());
	 
	            /* Will be added in original copy of Map but won't available in Iterator */
	            carPrice.put("Lamborghini", 300000D);
	        }
	        System.out.println("=== loop finished ===");
	        System.out.println("Car: Lamborghini" + ", Price: " + carPrice.get("Lamborghini"));
	    }
	}
	//}

