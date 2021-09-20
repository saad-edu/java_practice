package java_practice_codingbat;

import java.util.Scanner;

//Given 2 integer values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.

public class In3050_warmup1 {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a: ");
		a = input.nextInt();
		System.out.print("Enter b: ");
		b = input.nextInt();
		System.out.println(in3050 (a, b));

		input.close();
	}

	public static boolean in3050(int a, int b) {
		if (((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) || ((a >= 40 && a <= 50) && (b >= 40 && b <= 50)))
			return true;
		else
			return false;
	}
}
