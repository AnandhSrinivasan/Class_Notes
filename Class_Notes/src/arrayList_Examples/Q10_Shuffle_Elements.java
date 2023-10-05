package arrayList_Examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Q10_Shuffle_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Dell");
		arrayList.add("Apple");
		arrayList.add("Samsung");
		arrayList.add("Lenevo");
		System.out.println("The Brand name are :" +arrayList);
		
		Collections.shuffle(arrayList);
		System.out.println("The Shuffle Brand names are :" + arrayList);
		for (String values : arrayList) {
			System.out.println(values);
		}

	}

}
