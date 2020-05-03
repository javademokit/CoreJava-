package floor_room;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Room_Floor
{
	public static void main(String[] args)
	{
		Findroom("2");// Put floor no 
		
	}
	
	
		public static void Findroom(String s)
		{
		  List<String>floor1=new ArrayList<String>();
		  floor1.add("1");
		  floor1.add("2");
		  floor1.add("3");
		  floor1.add("4");
		  floor1.add("5");
		  floor1.add("6");
		  ArrayList<String> floor2 = new ArrayList<String>();
		  floor2.add("1");
		  floor2.add("2");
		  floor2.add("3");
		  ArrayList<String> floor3 = new ArrayList<String>();
		  floor3.add("1");
		  floor3.add("2");
		  floor3.add("3");
		  ArrayList<String> floor4 = new ArrayList<String>();
		  floor4.add("1");
		  floor4.add("2");
		  floor4.add("3");
		  ArrayList<String> floor5 = new ArrayList<String>();
		  floor5.add("1");
		  floor5.add("2");
		  floor5.add("3");
			Map<String, List<String>> m = new HashMap<String, List<String>>();
			   m.put("1", floor1);
			   m.put("2", floor2);
			   m.put("3", floor3);
			   m.put("4", floor4);
			   m.put("5", floor5);
			   for (Map.Entry<String, List<String>> me : m.entrySet()) 
			   {
			     String key = me.getKey();
			     if(s==key)
			     {
			     List<String> valueList = me.getValue();
			     System.out.println("\n"+"floor: " + key);
			     System.out.print("Room No:");
			     for (String s1 : valueList) 
			     {
			       System.out.print(s1 + " ");
			     }
			   }
			     
			     
	  }
   }
		
}
	
	
	
	


