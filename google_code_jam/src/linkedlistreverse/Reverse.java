package linkedlistreverse;

import java.util.LinkedList;
public class Reverse {
    public static void main(String args[]){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");
        linkedList.add("f");
        System.out.println("calling linkedlist method------");
        
        
        LinkedList<String> reversedlinkedList = reverse(linkedList);
        
        System.out.println("Reversed linkedList:"+reversedlinkedList);
        for(int i = 0; i <reversedlinkedList.size(); i++){
            System.out.println( reversedlinkedList.get(i));

        }
    }
    public static LinkedList<String> reverse(LinkedList<String> linkedList){
        for(int i = 0; i < linkedList.size()/2; i++)
        {
            String temp = linkedList.get(i);
            linkedList.set(i, linkedList.get(linkedList.size()-1-i));
            linkedList.set((linkedList.size()-1-i), temp);
        }
        return linkedList;
    }
}
