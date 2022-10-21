package SetDemo;

import java.util.Hashtable;

public class StrHashTable {
		
	public static void main(String[] args) {
		String s ="hello Testing Shastra";
		int occurance =1;
		Hashtable<Character, Integer> ht = new Hashtable(); //generic
		for (int i = 0; i < s.length(); i++) {
			if (ht.containsKey(s.charAt(i))) {
				int occ = ht.get(s.charAt(i));
				occ++;
				ht.put(s.charAt(i), occ);
			}else {
				ht.put(s.charAt(i),occurance);
			}
		}
		System.out.println(ht);
	}
}
