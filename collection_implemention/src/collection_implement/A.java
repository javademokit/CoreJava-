package collection_implement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class A
{
public static void main(String[] args)
{
	 // TODO Auto-generated method stub
    Integer[] a = { 11, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 1, 2, 2, 2, 2, 3, 4, 2 };
    List<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
    Set<Integer> set = new HashSet<Integer>(list);
    System.out.println(set);
    int highestSeq = 0;
    int seq = 0; 
    for (int i : set) {
        int tempCount = 0;
        for (int l : list) {
            if (i == l) {
                tempCount = tempCount + 1;
            }
            if (tempCount > highestSeq) {
                highestSeq = tempCount;
                seq = i;
            }
        }

    }

    System.out.println("highest sequence is " + seq + " repeated for " + highestSeq);
}
}
