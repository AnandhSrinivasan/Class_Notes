package multiplication;

import java.util.Scanner;

public class By_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("The Multiplication of Value :");
		int num = sc.nextInt();	
	        for (int i = 1; i <= 10; i++) {
	            int result = num * i;
	            System.out.println(num + " * " + i + " = " + result);
	        }sc.close();
	}
}
