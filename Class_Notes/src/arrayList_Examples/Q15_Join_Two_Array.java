package arrayList_Examples;

import java.util.ArrayList;

public class Q15_Join_Two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("MGR");
		arrayList.add("Karunanidhi");
		arrayList.add("Jayalalitha");
		arrayList.add("Vijayakanth");
		arrayList.add("Edapadi K.Palaniswamy");
		System.out.println("The CM names are :" + arrayList);
	ArrayList<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("Udhaynidhi");
		arrayList1.add("Inbanidhi");
		arrayList1.add("Arumainidhi");
		arrayList1.add("Wasted");
		System.out.println("The Future CM names are :" + arrayList1);
	    
		arrayList.addAll(arrayList1);	
		for (String element : arrayList) {
			System.out.println(element);
		}
	}

}
