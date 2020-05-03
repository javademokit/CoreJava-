package collectiongenric;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class list {
	
	
	public static void main(String[] args) {
		
		String courseID = "Comp-101";
		ArrayList<String> scores = new ArrayList<String> ();
		scores.add("100");
		scores.add("90");
		scores.add("80");
		scores.add("97");

		Map<String, ArrayList<String>> myMap = new HashMap<String, ArrayList<String>>();
		myMap.put(courseID, scores);
		//System.out.println(myMap);
		
		 for (Entry<String, ArrayList<String>> entry : myMap.entrySet()) {
		        System.out.println(entry.getKey() + " - " + entry.getValue());
		    }
		
		
	}

}
