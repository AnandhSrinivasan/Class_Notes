package collections_examples_Assesment;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterate_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Batsman= new ArrayList<>();  
		Batsman.add("Rohit");
		Batsman.add("Ishan");
		Batsman.add("Virat");
		Batsman.add("Rahul");
		Iterator<String> Iterator = Batsman.iterator();
		
		while (Iterator.hasNext()) {
			String string = Iterator.next();
			System.out.println(string);
		}
		for (String string : Batsman) {
			System.out.println(string); 
		}
	}

}
