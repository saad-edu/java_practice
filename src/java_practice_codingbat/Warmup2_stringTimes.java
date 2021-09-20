package java_practice_codingbat;

import java.util.Scanner;

//Given a string and a non-negative integer n, return a larger string that is n copies of the original string.

public class Warmup2_stringTimes {

	public static void main(String[] args) {
		String str;
		int n;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = input.nextLine();
		System.out.print("Enter n times to repeat: ");
		n = input.nextInt();
		System.out.println(stringTimes(str, n));

		input.close();
	}

	public static String stringTimes(String str, int n) {
		String newString = "";
		for (int i = 1; i <= n; i++)
			newString += str;
		return newString;
	}
}
