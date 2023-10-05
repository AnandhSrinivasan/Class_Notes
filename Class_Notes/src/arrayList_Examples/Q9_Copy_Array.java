package arrayList_Examples;

import java.util.ArrayList;

public class Q9_Copy_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Kailash");
		arrayList.add("Deva");
		arrayList.add("Anandh");
		arrayList.add("Madhavan");
		arrayList.add("Kalivardhan");
		arrayList.add("Ravanan");
		System.out.println(arrayList);
		ArrayList<String> arrayList1 = new ArrayList<String>();
		arrayList1.addAll(arrayList);
		System.out.println(arrayList1);
	}
}
