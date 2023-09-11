package oddOReven;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num= sc.nextInt();
		if (num % 2==0) {
			System.out.println("The given number is:" + num + "Even");
		} else {
			System.out.println("The given number is:" + num + "Odd");
		}sc.close();
	}
}
