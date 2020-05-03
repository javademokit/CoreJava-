package custome_sorting_comparator_non_genric_style;

import java.util.*;  
class NameComparator implements Comparator{  
public int compare(Object o1,Object o2){  
Student s1=(Student)o1;  
Student s2=(Student)o2;  
  
return s1.name.compareTo(s2.name);  
}  
}  
