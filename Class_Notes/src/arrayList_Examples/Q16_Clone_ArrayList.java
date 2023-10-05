package arrayList_Examples;

import java.util.ArrayList;

public class Q16_Clone_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Anandh");
		arrayList.add("Deva");
		arrayList.add("Kailash");
		arrayList.add("Madhavan");
		arrayList.add("Kalivardhan");
		System.out.println("Normal arraylist : ");
		System.out.println(arrayList);

	    ArrayList arraylist1  =(ArrayList)arrayList.clone();		
	    System.out.println("Clone arraylist : ");
		System.out.println(arraylist1);
	}

}
