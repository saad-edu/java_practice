package java_practice_codingbat;

import java.util.Scanner;

// Given an integer n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

public class Warmup1_diff21 {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number: ");
		n = input.nextInt();
		System.out.println("Difference over 21 = " + diff21(n));

		input.close();
	}

	public static int diff21(int n) {
		if (n <= 21)
			return 21 - n;
		else
			return 2 * (n - 21);
	}

}
