package java_practice_codingbat;

import java.util.Scanner;

//Given 2 non-negative integers, a and b, return their sum, so long as the sum has the same number of digits as a. If the sum has more digits than a, just return a without b. (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)

public class Logic1_sumLimit {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = input.nextInt();
		System.out.print("Enter b : ");
		b = input.nextInt();
		System.out.println(sumLimit(a, b));

		input.close();
	}

	public static int sumLimit(int a, int b) {
		return String.valueOf(a + b).length() == String.valueOf(a).length() ? a + b : a;
	}

}
