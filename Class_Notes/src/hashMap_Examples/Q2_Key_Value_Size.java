package hashMap_Examples;

import java.util.HashMap;

public class Q2_Key_Value_Size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		hashMap.put("Anandh", 1000 );
		hashMap.put("Deva", 2000);
		hashMap.put("Madhavan", 3000);
		//Duplicates keys and values not allowed in hashmap 
		//hashMap.put("Anandh", 2000);
		int values = hashMap.size();
		System.out.println("Size of the Hashmap is : " + values);
	}

}
