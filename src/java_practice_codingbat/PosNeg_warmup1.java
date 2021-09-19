package java_practice_codingbat;

import java.util.Scanner;

//Given 2 integers values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.

public class PosNeg_warmup1 {

	public static void main(String[] args) {
		int a, b;
		boolean negative;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		a = input.nextInt();
		System.out.print("Enter second number: ");
		b = input.nextInt();
		System.out.print("negative (true/false): ");
		negative = input.nextBoolean();
		System.out.println(posNeg(a, b, negative));

		input.close();
	}

	public static boolean posNeg(int a, int b, boolean negative) {
		if (a < 0 && b < 0 && negative == true || (a < 0 && b > 0 || a > 0 && b < 0) && negative == false)
			return true;
		else
			return false;
	}

}
