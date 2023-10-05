package ArrayList_Examples;

import java.util.ArrayList;

public class Q7_Search_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Anandh");
		arrayList.add("Deva");
		arrayList.add("Kailash");
		arrayList.add("Madhavan");
		arrayList.add("Kalivardhan");
		
		boolean value = arrayList.contains("Deva");
		System.out.println(value);
	}

}
