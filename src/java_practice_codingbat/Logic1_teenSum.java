package java_practice_codingbat;

import java.util.Scanner;

//Given 2 integers, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.

public class Logic1_teenSum {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = input.nextInt();
		System.out.print("Enter b : ");
		b = input.nextInt();
		System.out.println(teenSum(a, b));

		input.close();
	}

	public static int teenSum(int a, int b) {
		return a >= 13 && a <= 19 || b >= 13 && b <= 19 ? 19 : a + b;
	}

}
