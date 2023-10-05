package arrayList_Examples;

import java.util.ArrayList;
import java.util.List;

public class Q012_Extract_Portion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1); //0 Index
		arrayList.add(2);  //1 Index
		arrayList.add(3);   //2 Index
		arrayList.add(4);  //3 Index
		arrayList.add(5);   // 4Index
		arrayList.add(6);    //5 Index
		
		System.out.println("The Brand name are :" +arrayList);
		
		int start = 1;
		int end = 4;
		
		List<Integer> value = arrayList.subList(start, end);
		System.out.println(value);

	}

}
