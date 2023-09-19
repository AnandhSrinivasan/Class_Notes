package palindrome;

import java.util.Scanner;

public class Palindrome_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum= 0, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value: ");
		int n = sc.nextInt();
		
		temp=n;
		while (n > 0) {
			r = n % 10;
			sum = (sum*10)+r;
			n= n/10;
		}sc.close();
		if (temp==sum) {
			System.out.println("The given value is a palindrome");
		} else {
			System.out.println("The given value is not a palindrome");
		}
	}
}
