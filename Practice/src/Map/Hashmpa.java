package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmpa {
	
	public static void main(String[] args) {
		
		HashMap map=new HashMap();
		map.put("Garfield", 908);
		map.put("peach", null);
		map.put(9.00, 9087);
		map.put(null, 997);
		map.put(null, 880);
;		map.put(345, "Kali linux");
		map.put("rudy", 900);
		map.remove("rudy");
		System.out.println(map.containsKey("Garfield"));
		System.out.println(map.values());
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		System.out.println(map.isEmpty());

		System.out.println(map.containsValue(90));
		
		
;		System.out.println("----------------------------");



        Set<Map.Entry<String,Integer>> set=map.entrySet();
		
		for (Map.Entry entry : set) {
			
			System.out.println(entry.getKey()+" : "+entry.getValue());
			
		}
		
		System.out.println("----------------------------");
		
		
		System.out.println(map);
	}

}
