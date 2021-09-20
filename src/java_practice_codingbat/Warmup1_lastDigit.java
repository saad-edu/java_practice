package java_practice_codingbat;

import java.util.Scanner;

//Given two non-negative integer values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

public class Warmup1_lastDigit {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		a = input.nextInt();
		System.out.print("Enter second number: ");
		b = input.nextInt();
		System.out.println(lastDigit(a, b));

		input.close();
	}

	public static boolean lastDigit(int a, int b) {
		if (a % 10 == b % 10)
			return true;
		else
			return false;
	}

}
