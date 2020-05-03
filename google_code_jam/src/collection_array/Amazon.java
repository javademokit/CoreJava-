    package collection_array;

import java.util.ArrayList;

public class Amazon {

	public static void main(String[] args) {
		
		int[][] data = {{123},{4,5,6}};
	    int[][] copy = data.clone();
	    
	    /*System.out.println(copy);
	    System.out.println(data);*/
	    //System.out.println(data[0][0]);
	    copy[0][0] = 100;
	    
	    System.out.println(data[0][0]);
	    
	    System.out.println(copy[0][0]);
	    
	    copy[1] = new int[]{300,400,500};
	    
	    System.out.println(data[1][1]);
	    
	    System.out.println(copy[1][1]);
	}
}
