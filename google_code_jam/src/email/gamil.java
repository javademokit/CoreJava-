package email;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class gamil {
	  public static void main(String args[]) {
	List emails = new ArrayList();
    emails.add("sairamkrishna@tutorialspoint.com");
    emails.add("kittuprasad700@gmail.com");
    emails.add("sairamkrishna_mammahe%google-india.com");
    emails.add("sairam.krishna@gmail-indai.com");
    emails.add("sai#@youtube.co.in");    
    emails.add("kittu@domaincom");
    emails.add("kittu#gmail.com");
    emails.add("@pindom.com");
    
    String regex = "^(.+)@(.+)$";
    Pattern pattern = Pattern.compile(regex);
    
    for (Object email : emails) {
       Matcher matcher = pattern.matcher((CharSequence) email);
       System.out.println(email + " : " + matcher.matches());
    } 
 }
}

