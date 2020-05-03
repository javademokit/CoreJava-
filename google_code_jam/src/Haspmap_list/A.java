package Haspmap_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A {
public static void main(String[] args) {
	
	String[] words = {"ace", "boom", "crew", "dog", "eon"};  

	List<String> wordList = Arrays.asList(words);  

	for (String e : wordList)  
	{  
	    System.out.println(e);  
	}  
	
	
	
	String[] arr = { "40", "50", "60", "70", "80", "90", "100", };

	ArrayList<String> arr_list = new ArrayList<String>();
	ArrayList<String> arr_list1 = new ArrayList<String>(Arrays.asList(arr)); 
	System.out.println(arr_list1);
	
	List<String> list = Arrays.asList(arr);
	
	System.out.println(list);
	for (int i = 0; i < arr.length; i++)
	    arr_list1.add(arr[i]);
	
}
}
