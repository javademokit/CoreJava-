package Array2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class C_2d
{
	public static void main(String[] args) {
		 
		 Integer[] values = { 1, 3, 7 };
		 List<Integer> list = Arrays.asList(values);
		 System.out.println(list);
		 
		 Integer[] values1 = { 1, 3, 7 };
		 List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(values1));
		 System.out.println(list2);
		 
		  String[][] tax = {
		          {"AZ", "5%", "Annually", "$2,823,333", "After 30 Years", "$84,699,990", "Cash", "$57,050,000"},
		          {"AR", "7%", "Annually", "$2,742,667", "After 30 Years", "$82,280,010", "Cash", "$55,420,000"},
		          {"CO", "4%", "Annually", "$2,863,667", "After 30 Years", "$85,910,010", "Cash", "$57,865,000"},
		          {"CT", "6.7%", "Annually", "$2,754,767", "After 30 Years", "$82,643,010", "Cash", "$55,664,500"},
		          {"DE", "0%", "Annually", "$3,025,000", "After 30 Years", "$90,750,000", "Cash", "$61,125,000"},
		          {"FL", "0%", "Annually", "$3,025,000", "After 30 Years", "$90,750,000", "Cash", "$61,125,000"},
		          {"GA", "6%", "Annually", "$2,783,000", "After 30 Years", "$83,490,000", "Cash", "$56,235,000"},
		          {"ID", "7.8% ", "Annually", "$2,710,400", "After 30 Years", "$81,312,000", "Cash", "$54,768,000"},
		          {"IL", "5%", "Annually", "$2,823,333", "After 30 Years", "$84,699,990", "Cash", "$57,050,000"},
		      };
		  
		 // System.out.println(tax.length);
		  
		  
		 //System.out.println(tax[0].length);
		  for(int i=0;i<tax.length;i++)
		  {
			  System.out.println("row is-----> :"+i);
		  
		     for(int j=0;j<tax[i].length;j++)
		     {
		     System.out.println(tax[i][j]); 
		     }

		 //System.out.println(tax[0][0]);
		     
		     
		  }    
		     
		 
		}
		}


