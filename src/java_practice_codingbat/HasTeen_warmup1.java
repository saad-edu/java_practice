package java_practice_codingbat;

import java.util.Scanner;

//We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.

public class HasTeen_warmup1 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		a = input.nextInt();
		System.out.print("Enter second number: ");
		b = input.nextInt();
		System.out.print("Enter third number: ");
		c = input.nextInt();
		System.out.println(hasTeen(a, b, c));

		input.close();
	}

	public static boolean hasTeen(int a, int b, int c) {
		if (a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19)
			return true;
		else
			return false;
	}

}
