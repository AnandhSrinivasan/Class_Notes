package ArrayList_Examples;

public class Q5_Update_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrayList = {"Dog","Cow","Hen"};
		//System.out.println("The Older Elements are :" + arrayList);
		
		int indexToUpdate = 1;
		String newvalue = "Goat";
		if (indexToUpdate>=0 && indexToUpdate<arrayList.length) {
			arrayList[indexToUpdate] = newvalue;
            System.out.println("Element at index " + indexToUpdate + " updated as : " + newvalue);
		}
		for (String value : arrayList) {
			System.out.print(" " +value);
		}
	}

}
