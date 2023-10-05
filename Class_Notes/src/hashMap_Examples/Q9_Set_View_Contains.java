package hashMap_Examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q9_Set_View_Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
	       
		map.put("Nokia", 15000);
		map.put("Samsung", 25000);
		map.put("Realme", 10000);
		map.put("Redmi", 10);
		map.put("Apple", 0);
		
	Set<Map.Entry<String, Integer>> map1 = map.entrySet();
	System.out.println("Map values :" + map1);
	
	for (Map.Entry<String, Integer> entry : map1) {
		String val= entry.getKey();
	    Integer val1 =	entry.getValue();
		System.out.println("Key Is :" + val + " and Value is :" + val1);
	}
 }
}
