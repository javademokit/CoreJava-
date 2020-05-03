package String_swap;

public class Stringaddingnext4digit
{
	public static void main(String[] args)
	{
	String s=	incrementChars("abcdf7");
	System.out.println(s);
		
	}
	
	public  static String incrementChars(String s) {
	    StringBuilder result = new StringBuilder(s.length());
	    for (char c : s.toCharArray()) {
	        if (Character.isAlphabetic(c)) {
	            result.append((char) (c + 4));
	        } else {
	            result.append(c);
	        }
	    }
	    return result.toString();
	}
}
