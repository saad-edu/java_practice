package java_practice_codingbat;

import java.util.Scanner;

//Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).

public class String1_comboString {

	public static void main(String[] args) {
		String a, b;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a: ");
		a = input.nextLine();
		System.out.print("Enter b: ");
		b = input.nextLine();
		System.out.println(comboString(a, b));

		input.close();
	}

	public static String comboString(String a, String b) {
		if (a.length() > b.length())
			return b + a + b;
		else
			return a + b + a;
	}
}
