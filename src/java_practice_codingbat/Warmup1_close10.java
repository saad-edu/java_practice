package java_practice_codingbat;

import java.util.Scanner;

//Given 2 integer values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

public class Warmup1_close10 {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a: ");
		a = input.nextInt();
		System.out.print("Enter b: ");
		b = input.nextInt();
		System.out.println(close10(a, b));

		input.close();
	}

	public static int close10(int a, int b) {
		if (Math.abs(10 - a) == Math.abs(10 - b))
			return 0;
		else
			return Math.abs(10 - a) < Math.abs(10 - b) ? a : b;
	}

}
