package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.

public class String1_withoutEnd {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(withoutEnd(str));

		input.close();
	}

	public static String withoutEnd(String str) {
		if (str.length() == 2)
			return "";
		else
			return str.substring(1, str.length() - 1);
	}
}
