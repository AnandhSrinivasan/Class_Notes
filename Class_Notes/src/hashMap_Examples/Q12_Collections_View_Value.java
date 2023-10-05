package hashMap_Examples;

import java.util.Collection;
import java.util.HashMap;

public class Q12_Collections_View_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Nokia", 15000);
		map.put("Samsung", 25000);
		map.put("Realme", 10000);
		map.put("Redmi", 10);
		map.put("Apple", 0);
		System.out.println("Map values :" + map);
		
	Collection<Integer> value = map.values();
	System.out.println(value);
	for (Integer key : value) {
		System.out.println(key);
	}
 }
}
