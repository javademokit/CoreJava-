
public class Stringrotation
{
    static String leftrotate(String str, int d) 
    { 
            String ans = str.substring(d) + str.substring(0, d); 
            return ans; 
    } 
  
    static String rightrotate(String str, int d) 
    { 
            return leftrotate(str, str.length() - d); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
            String str1 = "1234";  
            System.out.println(leftrotate(str1, 2)); 
  
            String str2 = "1234";  
            System.out.println(rightrotate(str2, 2));  
    } 
} 

