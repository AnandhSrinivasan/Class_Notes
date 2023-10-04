package examples;

import java.util.ArrayList;

public class Q4_Retrieve {

	public static void main(String[] args) {
		ArrayList<String> arrays = new ArrayList<String>();
		arrays.add("A");
		arrays.add("B");
		arrays.add("C");
		arrays.add("D");
		arrays.add("E");
		System.out.println("The Elements are : " + arrays);
		
		int retrieve = 2;
		
		if (retrieve>=0 && retrieve<arrays.size()) {
			String value = arrays.get(retrieve);
			System.out.println("The Retrieve Index is : " + retrieve + " and the Element is : " + value);
		}
	}
}
