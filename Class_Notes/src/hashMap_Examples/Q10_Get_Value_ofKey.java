package hashMap_Examples;

import java.util.HashMap;

public class Q10_Get_Value_ofKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Nokia", 15000);
		map.put("Samsung", 25000);
		map.put("Realme", 10000);
		map.put("Redmi", 10);
		map.put("Apple", 0);
		System.out.println("Map values :" + map);
		Integer value = map.get("Redmi");
		Integer value1 = map.getOrDefault("Apple", 0);
		System.out.println("The value for the Key is : " + value);
		System.out.println("The value for the Key is : " + value1);
	}

}
