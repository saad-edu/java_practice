package java_practice_codingbat;

import java.util.Scanner;

//Given three integers, a b c, return true if one of them is 10 or more less than one of the others.

public class Logic1_lessBy10 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = input.nextInt();
		System.out.print("Enter b : ");
		b = input.nextInt();
		System.out.print("Enter c : ");
		c = input.nextInt();
		System.out.println(lessBy10(a, b, c));

		input.close();
	}

	public static boolean lessBy10(int a, int b, int c) {
		return Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(c - a) >= 10;
	}

}
