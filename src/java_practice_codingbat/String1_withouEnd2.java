package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.

public class String1_withouEnd2 {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(withouEnd2(str));

		input.close();
	}

	public static String withouEnd2(String str) {
		if (str.length() < 2)
			return "";
		else
			return str.substring(1, str.length() - 1);
	}
}
