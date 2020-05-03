package collection_object_shorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapshorting
{
public static void main(String[] args)
{
    Map<String, Employee> people = new HashMap<String, Employee>();
    Employee jim = new Employee("Jim", 25);
    Employee scott = new Employee("Scott", 28);
    Employee anna = new Employee("Anna", 23);
    people.put(jim.getName(), jim);
    people.put(scott.getName(), scott);
    people.put(anna.getName(), anna);
    // not yet sorted
    List<Employee> peopleByAge = new ArrayList<Employee>(people.values());
    Collections.sort(peopleByAge, new Comparator<Employee>() 
    {
        public int compare(Employee o1, Employee o2) {
            return o1.getAge() - o2.getAge();
        }
    });
    for (Employee p : peopleByAge) {
        System.out.println(p.getName() + "\t" + p.getAge());
    }
}

}

