package collections_examples_Assesment;

import java.util.HashMap;

public class View_Hashmap_Values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
	    hash_map.put(1,"Rohit");
	  hash_map.put(2,"Gill");
	  hash_map.put(3,"Virat");
	  hash_map.put(4,"Rahul");
	  hash_map.put(5,"Pandya");
	   System.out.println("Collection view is: "+ hash_map.values());
	}
}
