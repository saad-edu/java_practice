package java_practice_codingbat;

import java.util.Scanner;

//Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.

public class String1_withoutX {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(withoutX(str));

		input.close();
	}

	public static String withoutX(String str) {
		if (str.startsWith("x"))
			str = str.substring(1, str.length());
		if (str.endsWith("x"))
			str = str.substring(0, str.length() - 1);
		return str;
	}
}
