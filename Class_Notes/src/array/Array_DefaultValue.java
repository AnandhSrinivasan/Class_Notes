package array;

public class Array_DefaultValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Object[] mixedArray = new Object[5];

	        mixedArray[0] = "Hello, world!";
	        mixedArray[1] = 42;
	        mixedArray[2] = 3.14;
	        mixedArray[3] = 'A';
	        mixedArray[4] = true;
	        
	        for (Object obj : mixedArray) {
	            System.out.println(obj);
	        }
	}
}
