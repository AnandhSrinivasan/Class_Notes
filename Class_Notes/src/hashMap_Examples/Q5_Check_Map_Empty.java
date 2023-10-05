package hashMap_Examples;

import java.util.HashMap;
import java.util.Map;

public class Q5_Check_Map_Empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<String, Integer> map = new HashMap();
       
		map.put("Nokia", 15000);
		map.put("Samsung", 25000);
		map.put("Realme", 10000);
		map.put("Redmi", 10);
		map.put("Apple", 0);
		System.out.println("Map values :" + map);
		
		boolean value1 = map.containsKey("Apple");
		boolean value2 = map.containsValue(10);
		boolean value3 = map.isEmpty();
		boolean value4 = map.containsValue(100000);
		System.out.println("Check the Map has :" + value1);
		System.out.println("Check the Map has :" + value2);
		System.out.println("Check the Map has :" + value3);
		System.out.println("Check the Map has :" + value4);
	}

}
