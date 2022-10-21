package HashMap;
/**
 * HashMap iteration different ways
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HowToIterateHashmap {
	
	public static void main(String[] args) {
		HashMap hm = new HashMap<>();
		hm.put(1, "A");
		hm.put(2, "B");
		hm.put(3, "C");
		hm.put(4, "D");
		hm.put(5, "E");
		hm.put(6, "F");
		
		//1--> print values Using for loop
		
		Set<Integer> keys = hm.keySet();
		System.out.println("Print values using for loop: ");
		for (int key:keys) {
			System.out.println(hm.get(key));
		}
		
		//2--> print keys and values using for loop
		
		Set<Map.Entry> entries = hm.entrySet();
		System.out.println("Print keys = value using for loop: ");
		for (Map.Entry entry : entries) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		//3--> Print values using iterator
		Iterator itr = keys.iterator();
		System.out.println("Print values of iterator: ");
		while (itr.hasNext()) {
			System.out.println(hm.get(itr.next()));
	}
		//Print key = value using Iterator
		Iterator<Map.Entry> itr1 = entries.iterator();
		System.out.println("Print keys = value using iterator: ");
		while (itr1.hasNext()) {
			Map.Entry entry =  itr1.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
			
		}
}
}
