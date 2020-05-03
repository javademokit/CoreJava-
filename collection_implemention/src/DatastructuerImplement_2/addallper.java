package DatastructuerImplement_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class addallper
{
	public static void main(String[] args) {
	    String[] rawArgs = new String[]{"one", "two", "three", "four", "five"};

	    long start = System.nanoTime();
	    for (int i = 0; i < 10000000; i++) {
	        List<String> list = new ArrayList<>();
	        for (String s : rawArgs) {
	            list.add(s);
	        }
	    }
	    long end = System.nanoTime();
	    System.out.println("add():    " + (end - start));

	    start = System.nanoTime();
	    for (int i = 0; i < 10000000; i++) {
	        List<String> list = new ArrayList<>();
	        list.addAll(Arrays.asList(rawArgs));
	    }
	    end = System.nanoTime();
	    System.out.println("addAll(): " + (end - start));

	}

}
