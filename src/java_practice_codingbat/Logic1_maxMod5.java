package java_practice_codingbat;

import java.util.Scanner;

//Given two integer values, return whichever value is larger. However if the two values have the same remainder when divided by 5, then the return the smaller value. However, in all cases, if the two values are the same, return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.

public class Logic1_maxMod5 {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = input.nextInt();
		System.out.print("Enter b : ");
		b = input.nextInt();
		System.out.println(maxMod5(a, b));

		input.close();
	}

	public static int maxMod5(int a, int b) {
		if (a == b)
			return 0;
		return a % 5 == b % 5 ? Math.min(a, b) : Math.max(a, b);
	}

}
