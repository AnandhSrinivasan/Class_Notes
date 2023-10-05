package hashMap_Examples;

import java.util.HashMap;
import java.util.Map;

public class Q4_Remove_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Map<String, Integer> map = new HashMap();
		
		map.put("Nokia", 15000);
		map.put("Samsung", 25000);
		map.put("Realme", 10000);
		map.put("Redmi", 10);
		map.put("Apple", 0);
		System.out.println("Map values :" + map);
	
		// Method using remove
	Map<String, Integer> map1 = new HashMap();
	map1.put("Amar", 1000);
	map1.remove(map);
	System.out.println("Map1 values :" + map1);
	System.out.println("Map values after remove : " + map1);
	
	    //Another Method using clear
	map1.clear();
	System.out.println("Map1 values after clear method :" + map1);
	
	}

}
