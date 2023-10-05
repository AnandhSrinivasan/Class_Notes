package ArrayList_Examples;

import java.util.ArrayList;
import java.util.Collections;

public class Q8_Sort_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Kailash");
		arrayList.add("Deva");
		arrayList.add("Anandh");
		arrayList.add("Madhavan");
		arrayList.add("Kalivardhan");
		
		Collections.sort(arrayList);
		System.out.println("Ascending order : " + arrayList);
	}

}
