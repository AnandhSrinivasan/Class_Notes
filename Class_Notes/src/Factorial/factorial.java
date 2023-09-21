package Factorial;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; i++)
        {
            factorial = factorial * i;
        }sc.close();
        System.out.println("The Factorial of Given number is :" +  factorial);
	}
}
