package java_practice_codingbat;

import java.util.Scanner;

//Given 2 positive integer values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

public class Warmup1_max1020 {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a: ");
		a = input.nextInt();
		System.out.print("Enter b: ");
		b = input.nextInt();
		System.out.println(max1020(a, b));

		input.close();
	}

	public static int max1020(int a, int b) {
		if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20)) {
			if (a >= b)
				return a;
			else
				return b;
		} else if ((a >= 10 && a <= 20) && !(b >= 10 && b <= 20))
			return a;
		else if (!(a >= 10 && a <= 20) && (b >= 10 && b <= 20))
			return b;
		else
			return 0;

	}
}
