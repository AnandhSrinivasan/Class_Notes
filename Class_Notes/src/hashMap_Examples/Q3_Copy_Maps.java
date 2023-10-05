package hashMap_Examples;

import java.util.HashMap;
import java.util.Map;

public class Q3_Copy_Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap();
		
		map.put("Nokia", 15000);
		map.put("Samsung", 25000);
		map.put("Realme", 10000);
		map.put("Redmi", 10);
		map.put("Apple", 0);
		System.out.println("Map values :" + map);
		
		Map<String, Integer> map1 = new HashMap();
		map1.putAll(map);
		System.out.println("Copied values :" + map1);
	}

}
