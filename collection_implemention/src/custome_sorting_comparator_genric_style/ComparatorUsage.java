package custome_sorting_comparator_genric_style;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorUsage {
    public static void main(String[] args) {
 
        Employee emp1=new Employee("sam","4");
        Employee emp2=new Employee("amy","2");
        Employee emp3=new Employee("brad","1");

        ArrayList<Employee> list=new ArrayList<Employee>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
      
        System.out.println("list Before sorting : \n"+list);
 
        Collections.sort(list,new Employee().new ComparatorName());
        System.out.println("\nlist after sorting on basis of name(ascending order), "
                  + "using inner class : \n"+ list);
 
        Collections.sort(list,new Employee.ComparatorId());
        System.out.println("\nlist after sorting on basis of id(ascending order), "
                  + "using static inner class : \n"+list);
       
    }
}
 
 
/*OUTPUT
 
list Before sorting :
[Employee{name=sam, id=4}, Employee{name=amy, id=2}, Employee{name=brad, id=1}]
 
list after sorting on basis of name(ascending order) :
[Employee{name=amy, id=2}, Employee{name=brad, id=1}, Employee{name=sam, id=4}]
 
list after sorting on basis of id(ascending order) :
[Employee{name=brad, id=1}, Employee{name=amy, id=2}, Employee{name=sam, id=4}]
 
*/
