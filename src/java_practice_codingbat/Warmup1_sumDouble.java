package java_practice_codingbat;

import java.util.Scanner;

//Given two integers values,return their sum.Unless the two values are the same,then return double their sum.

public class Warmup1_sumDouble {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		a = input.nextInt();
		System.out.print("Enter second integer: ");
		b = input.nextInt();
		System.out.println(sumDouble(a, b));

		input.close();

	}

	public static int sumDouble(int a, int b) {
		if (a == b)
			return 4 * a;
		else
			return a + b;
	}
}
