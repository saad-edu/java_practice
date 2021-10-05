package java_practice_codingbat;

import java.util.Scanner;

//Given three integers, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.

public class Logic2_closeFar {

	public static void main(String[] args) {
		int a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = input.nextInt();
		System.out.print("Enter b : ");
		b = input.nextInt();
		System.out.print("Enter c : ");
		c = input.nextInt();
		System.out.println(closeFar(a, b, c));

		input.close();
	}

	public static boolean closeFar(int a, int b, int c) {
		return (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2)
				|| (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2);
	}
}
