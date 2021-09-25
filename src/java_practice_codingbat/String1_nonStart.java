package java_practice_codingbat;

import java.util.Scanner;

//Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

public class String1_nonStart {

	public static void main(String[] args) {
		String a, b;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a: ");
		a = input.nextLine();
		System.out.print("Enter b: ");
		b = input.nextLine();
		System.out.println(nonStart(a, b));

		input.close();
	}

	public static String nonStart(String a, String b) {
		return a.substring(1, a.length()) + b.substring(1, b.length());
	}
}
