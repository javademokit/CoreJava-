package DatastructuerImplement_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import thread.mainclass;

public class user_of_addall
{

public static void main(String[] args)
{
	String[] rawArgs = new String[]{"one", "two", "three", "four", "five"};

	// More efficient - 894 ns
	List<String> list1 = new ArrayList<>();
	for (String s : rawArgs) {
	    list1.add(s);
	}
	
	
	
    System.out.println("use of add all--------------------");
	// Less efficient - 1340 ns
	List<String> list = new ArrayList<>();
	list.addAll(Arrays.asList(rawArgs));
	
	System.out.println(list);
}
	
	
}
