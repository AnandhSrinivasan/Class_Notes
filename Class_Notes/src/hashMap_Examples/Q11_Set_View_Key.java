package hashMap_Examples;

import java.util.HashMap;
import java.util.Set;

public class Q11_Set_View_Key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Nokia", 15000);
		map.put("Samsung", 25000);
		map.put("Realme", 10000);
		map.put("Redmi", 10);
		map.put("Apple", 0);
		System.out.println("Map values :" + map);
	
		Set<String> set = map.keySet();
		System.out.println(set);
		for (String key : set) {
			System.out.println(key);
		}
	}
}
