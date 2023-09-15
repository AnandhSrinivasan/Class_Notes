package array;

public class Array_DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char[] charArray = {'a', 'b', 'c', 'd', 'e'};
		 byte[] byteArray = {1, 2, 3, 4, 5};
	     short[] shortArray = {10, 20, 30, 40, 50};
	     long[] longArray = {1000L, 2000L, 3000L, 4000L, 5000L};
	     float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
	     double[] doubleArray = {1.11, 2.22, 3.33, 4.44, 5.55};
		
	     System.out.println("Characters:");
	        for (char c : charArray) {
				System.out.print(c + " ");
			} 
            System.out.println();  
            
	        System.out.println("Bytes:");
	        for (byte b : byteArray) {
	            System.out.print(b + " ");
	        }
	        System.out.println();

	        System.out.println("Shorts:");
	        for (short s : shortArray) {
	            System.out.print(s + " ");
	        }
	        System.out.println();

	        System.out.println("Longs:");
	        for (long l : longArray) {
	            System.out.print(l + " ");
	        }
	        System.out.println();

	        System.out.println("Floats:");
	        for (float f : floatArray) {
	            System.out.print(f + " ");
	        }
	        System.out.println();

	        System.out.println("Doubles:");
	        for (double d : doubleArray) {
	            System.out.print(d + " ");
	        }
	        System.out.println();
	     
	     /*
			 * System.out.println("Characters:" + charArray); System.out.println("Bytes:" +
			 * byteArray); System.out.println("Short:" + shortArray);
			 * System.out.println("Long:" + longArray); System.out.println("Float:" +
			 * floatArray); System.out.println("Double:" + doubleArray);
			 */
	}
}
