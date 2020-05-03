package password;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Scanner;

public class password {
	public static void main(String[] args) {
	    System.out.println("please enter a password");
	    // don't actually do this, this is an example only.
	    Scanner in = new Scanner(System.in);
	    String password = in.nextLine();
	    usePassword(password);

	    clearString(password);

	    System.out.println("password: '" + password + "'");
	}

	private static void usePassword(String password) {

	}

	private static void clearString(String password) {
	    try {
	        Field value = String.class.getDeclaredField("value");
	        value.setAccessible(true);
	        char[] chars = (char[]) value.get(password);
	        Arrays.fill(chars, '*');
	    } catch (Exception e) {
	        throw new AssertionError(e);
	    }
	}
}
