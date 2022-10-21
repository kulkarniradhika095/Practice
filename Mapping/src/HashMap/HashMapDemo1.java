package HashMap;
/**
 * capacity grows by double
 */
import java.util.HashMap;

public class HashMapDemo1 {
	
	public static void main(String[] args) {
		HashMap hm = new HashMap();//[cap=16, load factor=75% (by default)]
		hm.put(1, "A");
		hm.put(2, "B");
		hm.put(3, "C");
		hm.put(4, "D");
		hm.put(5, "E");
		hm.put(6, "F");
		hm.put(7, "G");
		
		HashMap size = new HashMap(60);//cap=60, [load factor=75%(by default)]
		
		HashMap lf = new HashMap(45,0.8f);//cap=60, load factor 80%
		
		HashMap copy = new HashMap(hm);
		
		System.out.println(hm);
		
	}
}
