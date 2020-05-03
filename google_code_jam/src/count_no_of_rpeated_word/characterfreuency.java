 package count_no_of_rpeated_word;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class characterfreuency {
	
	public static void main(String[] args) {
		HashMap<Character,Integer> frequencies = new HashMap<>();
		String input = "aasfeafd";
		for (char ch : input.toCharArray()) 
		   {
		   frequencies.put(ch, frequencies.getOrDefault(ch, 0) + 1);
	       }
		System.out.println(frequencies);
		
		
		
		
}
}