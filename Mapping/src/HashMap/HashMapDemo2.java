package HashMap;
/**
 * hashmap of arraylist
 */
import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo2 {
	
	public static void main(String[] args) {
		ArrayList firstName = new ArrayList();
		firstName.add("Jana");
		firstName.add("Kalyani");
		firstName.add("Ankush");
		firstName.add("Aditi");
		firstName.add("Chetna");
		
		
		ArrayList lastName = new ArrayList();
		lastName.add("Kale");
		lastName.add("Satpute");
		lastName.add("Dahat");
		lastName.add("Vyas");
		lastName.add("Devgade");
		
		HashMap<Integer, ArrayList> hm = new HashMap();
		hm.put(1, firstName);
		hm.put(2, lastName);
		
		
				
		System.out.println(hm);
	}
}
