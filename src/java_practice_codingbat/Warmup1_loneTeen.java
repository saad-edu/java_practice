package java_practice_codingbat;

import java.util.Scanner;

//We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.

public class Warmup1_loneTeen {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		a = input.nextInt();
		System.out.print("Enter second number: ");
		b = input.nextInt();
		System.out.println(loneTeen(a, b));

		input.close();
	}

	public static boolean loneTeen(int a, int b) {
		if ((a >= 13 && a <= 19) && (b >= 13 && b <= 19))
			return false;
		else
			return (a >= 13 && a <= 19) || (b >= 13 && b <= 19);
	}

}
