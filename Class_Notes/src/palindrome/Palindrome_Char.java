package palindrome;

public class Palindrome_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palindrome = "MadaM";
		String Rev= "";
		System.out.println("The String value is " + palindrome);
		for (int i = 0; i < palindrome.length(); i++) {
			Rev = Rev + palindrome.charAt(i);
		}
		if (palindrome.equals(Rev)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is Not Palindrome");
		}
	}
}
