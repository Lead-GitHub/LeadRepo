package hashmap_class;

import java.util.HashMap;

public class Addition {
	
	public static void main(String[] args) {
		 
		A a1 = new A();
		
		a1.setA("001");
		a1.setB("002");
		a1.setC("003");
		
		
		HashMap<String, String> hs = new HashMap<String, String>();
		hs.put(a1.getA(), "suraj");
		hs.put(a1.getB(), "bikash");
		hs.put(a1.getC(), "muna");
		
		hs.remove("001");
		hs.replace("003", "ram");
		System.out.println(hs.containsKey("002"));
		System.out.println(hs);
		
	}
}
