package email;

public class Main {
	   public static void main(String[] args) {
	      String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	      
	      String email1 = "user@domain.com";
	      
	      Boolean b = email1.matches(EMAIL_REGEX);
	      
	      System.out.println("is e-mail: "+email1+" :Valid = " + b);
	      String email2 = "user^domain.co.in";
	      b = email2.matches(EMAIL_REGEX);
	      System.out.println("is e-mail: "+email2+" :Valid = " + b);
	   }
	}