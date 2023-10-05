package hashMap_Examples;

import java.util.HashMap;

public class Q1_Specified_Key_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hash = new HashMap<>();
		
		String key = "Anandh";
		int value = 2121;
		
		hash.put(key, value);
		
		int retrieve = hash.get(key);
		
		System.out.println("Value for the key " + key + " is : " + retrieve);
	}
}
