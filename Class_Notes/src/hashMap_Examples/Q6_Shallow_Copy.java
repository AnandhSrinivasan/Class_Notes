package hashMap_Examples;

import java.util.HashMap;


public class Q6_Shallow_Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	       
		 HashMap<Integer,String> map = new HashMap<Integer,String>();  
		  map.put(1, "yellow");
		  map.put(2, "Black");
		  map.put(3, "Violet");
		  map.put(4, "White");	
			System.out.println("HashMap values : " + map);
	 
			HashMap<Integer,String> map1 = new HashMap<Integer,String>();	
			map1 = (HashMap)map.clone();     
			System.out.println("Cloned HashMap : " + map1);        
		}
}
