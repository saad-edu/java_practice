package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.

public class String1_extraFront {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(extraFront(str));

		input.close();
	}

	public static String extraFront(String str) {
		if (str.length() < 2)
			return str + str + str;
		else
			return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
	}
}
