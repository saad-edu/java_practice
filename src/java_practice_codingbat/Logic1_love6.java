package java_practice_codingbat;

import java.util.Scanner;

//The number 6 is a truly great number. Given two integer values, a and b, return true if either one is 6. Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.

public class Logic1_love6 {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = input.nextInt();
		System.out.print("Enter b: ");
		b = input.nextInt();
		System.out.println(love6(a, b));

		input.close();
	}

	public static boolean love6(int a, int b) {
		return a == 6 || b == 6 || Math.abs(a - b) == 6 || a + b == 6;
	}

}
