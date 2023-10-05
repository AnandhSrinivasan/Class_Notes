package ArrayList_Examples;

import java.util.ArrayList;

public class Q3_ArrayList_Insert_FirstPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("Older ArrayList:" + fruits);

        String newFruit = "Grapes";
        fruits.add(0, newFruit);
        
        System.out.println("Updated ArrayList:" + fruits);
	}

}
