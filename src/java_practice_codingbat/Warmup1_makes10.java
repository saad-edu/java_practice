package java_practice_codingbat;

import java.util.Scanner;

//Given 2 integers, a and b, return true if one if them is 10 or if their sum is 10.

public class Warmup1_makes10 {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		a = input.nextInt();
		System.out.print("Enter second number: ");
		b = input.nextInt();
		System.out.println(makes10(a, b));

		input.close();
	}

	public static boolean makes10(int a, int b) {
		if (a == 10 || b == 10 || a + b == 10)
			return true;
		else
			return false;
	}

}
