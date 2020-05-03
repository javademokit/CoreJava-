package collection_implement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class threadsafe
{
public static void main(String[] args)
{
	List<String> unsafeList = new ArrayList<>();
	List<String> safeList = Collections.synchronizedList(unsafeList);
	safeList.add("Boom");   // safe to use with multiple threads
	String[] fruits = {"Apple", "Banana", "Lemon", "Grape", "Mango"};
	
	List<String> list1 = new CopyOnWriteArrayList<>(fruits);
	for(String s:list1)
	{
		System.out.println(s);
	}
		

}

}
