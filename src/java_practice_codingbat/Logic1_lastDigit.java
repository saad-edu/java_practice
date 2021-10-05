package java_practice_codingbat;

import java.util.Scanner;

//Given three integers, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.

public class Logic1_lastDigit {

	public static void main(String[] args) {
		int a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = input.nextInt();
		System.out.print("Enter b : ");
		b = input.nextInt();
		System.out.print("Enter c : ");
		c = input.nextInt();
		System.out.println(lastDigit(a, b, c));

		input.close();
	}

	public static boolean lastDigit(int a, int b, int c) {
		return a % 10 == b % 10 || b % 10 == c % 10 || c % 10 == a % 10;
	}

}
