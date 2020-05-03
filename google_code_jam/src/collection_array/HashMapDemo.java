package collection_array;

import java.util.*;
class  HashMapDemo
{
 public static void main(String[] args) 
 {
  HashMap h=new HashMap();
  h.put(100,"example1");
  h.put(200,"example2");
  h.put(500,"example3");
  h.put(400,"example4");
  h.put(300,"example5");
  System.out.println(h);//to print Map
   
  Set s=h.keySet();//to get keys
  System.out.println(s);
   
  Collection c=h.values();//to get values
  System.out.println(c);
   
  Set s1=h.entrySet();//to get whole entrys
  Iterator itr=s1.iterator();
   while(itr.hasNext())
   {
     Map.Entry m=(Map.Entry)itr.next();//to get next entry (and casting required because values are object type)
                                        //Entry is inner interface of Map interface
     {
       System.out.println(m.getKey()+"..."+m.getValue());
       if(m.getKey().equals(400))
            m.setValue("goodexample");//it replaces value if associated value exist and return old value
      }
   }
   System.out.println(h);
 }
}
