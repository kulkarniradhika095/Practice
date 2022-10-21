package SetDemo;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {



	public static void main(String[] args) {
		 
		LinkedHashSet hs = new LinkedHashSet();//Capacity: 16 , loadFactor(LF): 75%
		
		hs.add(10);//10%16=10
		hs.add(27);//27%16=9
		hs.add(18);//18%16=2
		hs.add(12);//12%16=12
		hs.add(41);//41%16=9
		hs.add(39);//39%16=7
		hs.add(24);//24%16=8
		hs.add(24);//boolean, it will not ass element in hashset
		
		System.out.println(hs);
	
}
}

	

