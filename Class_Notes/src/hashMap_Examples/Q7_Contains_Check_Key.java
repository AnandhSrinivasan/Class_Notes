package hashMap_Examples;

import java.util.HashMap;

public class Q7_Contains_Check_Key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
	       
		map.put("Nokia", 15000);
		map.put("Samsung", 25000);
		map.put("Realme", 10000);
		map.put("Redmi", 10);
		map.put("Apple", 0);
		System.out.println("Map values :" + map);
		//boolean values = map.containsValue(100);
		boolean values1 = map.containsKey("Samsung");
		//System.out.println(values);
		System.out.println(values1);
	}

}
