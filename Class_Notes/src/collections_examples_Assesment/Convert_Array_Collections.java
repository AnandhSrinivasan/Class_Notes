package collections_examples_Assesment;

import java.util.Arrays;
import java.util.List;

public class Convert_Array_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String playersArray[ ] = { "Virat", "Jaddu", "Dhoni", "Bumrah" };
		System.out.println("Array values :" + Arrays.toString(playersArray));
		
		List<String> playerslist = Arrays.asList(playersArray);
		System.out.println("Array Convert values :" + playerslist);
	}

}
