package java_practice_codingbat;

import java.util.Scanner;

//Given 2 integer values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.

public class Logic2_blackjack {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = input.nextInt();
		System.out.print("Enter b : ");
		b = input.nextInt();
		System.out.println(blackjack(a, b));

		input.close();
	}

	public static int blackjack(int a, int b) {
		if (a > 21 && b > 21)
			return 0;
		if (b > 21)
			return a;
		if (a > 21)
			return b;
		return Math.abs(a - 21) <= Math.abs(b - 21) ? a : b;
//		or return Math.max(a, b);
	}
}
