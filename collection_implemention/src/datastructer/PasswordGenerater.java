package datastructer;

import java.util.Random;

/**
 *
 * @author dell
 */
public class PasswordGenerater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int length= 11;
        System.out.println(generatePswd(length));
    }
    static char[] generatePswd(int len){
        System.out.println("Your Password ");
        String charsCaps="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        String Chars="abcdefghijklmnopqrstuvwxyz";
        String nums="0123456789";
        String symbols="!@#$%^&*()_+-=.,/';:?><~*/-+";
        String passSymbols=charsCaps + Chars + nums +symbols;
        Random rnd=new Random();
        char[] password=new char[len];
        for(int i=0; i<len;i++){
            password[i]=passSymbols.charAt(rnd.nextInt(passSymbols.length()));
        }
      return password;

    }
}
