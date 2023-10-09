package collections_examples_Assesment;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Dhoni");
		arrayList.add("Yuvi");
		arrayList.add("Virat");
		arrayList.add("Zaheer");
		arrayList.add("Raina");
		arrayList.add("Sachin");
		System.out.println("arraylist : " +arrayList);
		Collections.shuffle(arrayList);
		System.out.println("Shuffled arraylist : " +arrayList);
	}

}
