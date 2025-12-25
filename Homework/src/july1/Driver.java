package july1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Driver {
public static void main(String[] args) {
	
 //TreeMap<String,Student> map=new TreeMap<>();
	

	LinkedHashMap<String,Student> map=new LinkedHashMap<>();
	
	map.put("Pamal",new Student(101,"pamal",13));
	map.put("Qamal",new Student(102,"Qamal",16));
	map.put("Oamal",new Student(103,"Oamal",16));
	
	
for (Map.Entry<String,Student> set : map.entrySet()) {
	
              	System.out.println(set.getKey() +" : "+set.getValue());
	
}
	
	
}
}
