package string_digitexctarct;

public class number {
	public static void main(String[] args) {
		String alphaNumericString = "h8ll0@1234sdrg";
        char[] carray = alphaNumericString.toCharArray();
        for (char c : carray) 
        {
            if (Character.isDigit(c))
            {
               System.out.print(c);

           }
        }
	}

}
