package Haspmap_list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
class ShuffleArrayExample {
 
  public static void main(String[] args) {
 
    // String Array
    String[] stringArray = 
        new String[] { "FF", "PP", "AA", "OO", "DD" };

    // converting array to a List
    List<String> list = Arrays.asList(stringArray);

    // Shuffling list elements
    Collections.shuffle(list);
 
    System.out.println("String Array: ");
    for (String str : list) {
       System.out.println(str);
    }
 
    Integer[] intArray = new Integer[]{11, 22, 33, 44, 55};
    
    /* Rememeber: If you define the array like this:
     * int[] array = new int[]{1, 2, 3, 4}; then the below 
     * method won't work as it doesn't work for primitive types
     */
 
    List<Integer> list2 = Arrays.asList(intArray);

    // Shuffling list elements
    Collections.shuffle(list2);
 
    System.out.println("Int Array: ");
    for (int num : list2) {
       System.out.println(num);
    }
  }
}