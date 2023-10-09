package collections_examples_Assesment;

import java.util.ArrayList;

public class Add_Two_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Batsman= new ArrayList<String>();
		Batsman.add("Rohit");
		Batsman.add("Ishan");
		Batsman.add("Virat");
		Batsman.add("Rahul");
		ArrayList<String> Bowlers= new ArrayList<String>();
		Bowlers.add("Kuldeep");
		Bowlers.add("Siraj");
		Bowlers.add("Bumrah");
		Bowlers.add("Shami");
	   
		Batsman.addAll(Bowlers);
		System.out.println(Batsman);
	}

}
