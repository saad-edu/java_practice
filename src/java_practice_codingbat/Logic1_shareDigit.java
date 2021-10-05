package java_practice_codingbat;

import java.util.Scanner;

//Given two integers, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)

public class Logic1_shareDigit {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = input.nextInt();
		System.out.print("Enter b : ");
		b = input.nextInt();
		System.out.println(shareDigit(a, b));

		input.close();
	}

	public static boolean shareDigit(int a, int b) {
		return a / 10 == b / 10 || a / 10 == b % 10 || a % 10 == b / 10 || a % 10 == b % 10;
	}

}
