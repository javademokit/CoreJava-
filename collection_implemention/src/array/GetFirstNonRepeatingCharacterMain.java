package array;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;
 
public class GetFirstNonRepeatingCharacterMain {
 public static void main(String[] args) {
  System.out.println("First non repeated character for String analogy is : " + getNonRepeatedCharacter("analogy"));
  System.out.println("First non repeated character for String easiest is : " + getNonRepeatedCharacter("easiest"));
 }
 
 public static Character getNonRepeatedCharacter(String str) {
  Map<Character, Integer> countCharacters = new LinkedHashMap<Character, Integer>();
  for (int i = 0; i < str.length() - 1; i++) {
   Character c = str.charAt(i);
   if (!countCharacters.containsKey(c)) {
    countCharacters.put(c, 1);
   } else {
    countCharacters.put(c, countCharacters.get(c) + 1);
   }
  }
  // As LinkedHashMap maintains insertion order, first character with
  // count 1 should return first non repeated character
  for (Entry<Character, Integer> e : countCharacters.entrySet()) {
   if (e.getValue() == 1)
    return e.getKey();
 
  }
  return null;
 
 }
}
/*for (Character c : charCountMap.keySet()) {
	   if (charCountMap.get(c) > 1)
	    System.out.println("duplicate character : " + c + " ====== " + " count : " + charCountMap.get(c));
	 
	  }*/
/*
public static Character getNonRepeatedCharacter(String str)
{     char charaaray[]=str.toCharArray();
      for (int i=0; i<str.length();i++)
     {
         if (str.lastIndexOf(charaaray[i]) == str.indexOf(charaaray[i]))
              return charaaray[i];
     }
 return null;
}
}*/




