package DatastructuerImplement_2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import thread.mainclass;
public class substring_secondway
{
	public static void main(String[] args)
	{
		ArrayList<String>list=new ArrayList<String>();
		String string, sub;
	      string="shyam";
	      int length = string.length();   
	      for (int i=0; i < length; i++)
	      {
	         for(int j = 1; j <=length - i; j++)
	         {
	            sub = string.substring(i, i+j);
	            list.add(sub);
	         }
	}
	      System.out.println(list);
	      System.out.println(list.size());
}}