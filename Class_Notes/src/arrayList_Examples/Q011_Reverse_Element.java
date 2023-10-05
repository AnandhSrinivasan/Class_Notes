package arrayList_Examples;

import java.util.ArrayList;
import java.util.Collections;

public class Q011_Reverse_Element {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Dell");
		arrayList.add("Apple");
		arrayList.add("Samsung");
		arrayList.add("Lenevo");
		System.out.println("The Brand name are :" +arrayList);
		
		Collections.reverse(arrayList);
		System.out.println("The Reverse Brand name are :" +arrayList);

	}

}
