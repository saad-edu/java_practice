package java_practice_codingbat;

import java.util.Scanner;

//Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

public class String1_conCat {

	public static void main(String[] args) {
		String a, b;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string a: ");
		a = input.nextLine();
		System.out.print("Enter string b: ");
		b = input.nextLine();
		System.out.println(conCat(a, b));

		input.close();
	}

	public static String conCat(String a, String b) {
		if (a.length() != 0 && b.length() != 0 && a.charAt(a.length() - 1) == b.charAt(0))
			return a.substring(0, a.length() - 1) + b;
		else
			return a + b;
	}

}
