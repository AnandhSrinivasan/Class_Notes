package Grade;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
	        if (marks >=90) {
	            System.out.println("Grade A");
	        } else if (marks >= 75) {
	            System.out.println("Grade B");
	        } else if (marks >= 50) {
	            System.out.println("Grade C");
	        } else {
	            System.out.println("Grade F");
	        }
	}
}
