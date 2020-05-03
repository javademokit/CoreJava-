package collection_object_shorting;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedSet;
import java.util.TreeSet;

public class Hashmap_shorting
{

	public static void main(String[] args)
	{
		Map<String, Integer> nonSortedMap = new HashMap<String, Integer>();
		nonSortedMap.put("ape", 1);
		nonSortedMap.put("pig", 3);
		nonSortedMap.put("cow", 1);
		nonSortedMap.put("frog", 2);

		for (Entry<String, Integer> entry  : entriesSortedByValues(nonSortedMap)) {
		    System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
	static <K,V extends Comparable<? super V>> SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
        SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
            new Comparator<Map.Entry<K,V>>() {
                @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
                    int res = e1.getValue().compareTo(e2.getValue());
                    return res != 0 ? res : 1; // Special fix to preserve items with equal values
                }
            }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }
}
