package vowelcount;

public class CountVowels_withoutloop
{
	 public void count(String str) 
	 {
		 
		         int count = 0;
		 
		         for (int i = 0; i < str.length(); i++) {
		 
		             char ch = str.charAt(i);
		 
		             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
		 
		                 count++;
		 
		             }
		 
		         }
		 
		         System.out.println("Number of vowels : " + count);
		 
		     }
		
		 }


