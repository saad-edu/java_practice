package java_practice_codingbat;

import java.util.Scanner;

//Given 3 integer values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.

public class Logic2_loneSum {

	public static void main(String[] args) {
		int a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = input.nextInt();
		System.out.print("Enter b : ");
		b = input.nextInt();
		System.out.print("Enter c : ");
		c = input.nextInt();
		System.out.println(loneSum(a, b, c));

		input.close();
	}

	public static int loneSum(int a, int b, int c) {
		if (a == b && b == c)
			return 0;
		if (b == c)
			return a;
		if (c == a)
			return b;
		if (a == b)
			return c;
		return a + b + c;
	}

}
