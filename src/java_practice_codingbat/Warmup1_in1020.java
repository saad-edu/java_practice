package java_practice_codingbat;

import java.util.Scanner;

//Given 2 integer values, return true if either of them is in the range 10..20 inclusive.

public class Warmup1_in1020 {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		a = input.nextInt();
		System.out.print("Enter second number: ");
		b = input.nextInt();
		System.out.println(in1020(a, b));

		input.close();
	}

	public static boolean in1020(int a, int b) {
		if (a >= 10 && a <= 20 || b >= 10 && b <= 20)
			return true;
		else
			return false;
	}

}
