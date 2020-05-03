package datastructer;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String args[]){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");
        linkedList.add("f");
        System.out.println("Original linkedList:");
        for(int i = 0; i <=linkedList.size()-1; i++){
            System.out.println(" - "+ linkedList.get(i));

        }
        LinkedList<String> reversedlinkedList = reverse(linkedList);
        System.out.println("Reversed linkedList:");
        for(int i = 0; i <=reversedlinkedList.size()-1; i++){
            System.out.println(" - "+ reversedlinkedList.get(i));
        }
    }
    
    
    public static LinkedList<String> reverse(LinkedList<String> linkedList){
        for(int i = 0; i < linkedList.size()/2; i++){
            String temp = linkedList.get(i);
            linkedList.set(i, linkedList.get(linkedList.size()-1-i));
            linkedList.set((linkedList.size()-1-i), temp);
        }
        return linkedList;
    }
}