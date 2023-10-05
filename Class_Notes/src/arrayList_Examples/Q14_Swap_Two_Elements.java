package arrayList_Examples;

import java.util.ArrayList;
import java.util.Collections;

public class Q14_Swap_Two_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Dell");
		arrayList.add("Apple");
		arrayList.add("Samsung");
		arrayList.add("Lenevo");
		System.out.println("Before Swap The Brand name are :");
		System.out.println(arrayList);
		Collections.swap(arrayList, 0, 1);
		System.out.println("After Swap The Brand name are :");
		System.out.println(arrayList);
	}

}
