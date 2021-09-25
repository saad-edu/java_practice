package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

public class String1_extraEnd {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(extraEnd(str));

		input.close();
	}

	public static String extraEnd(String str) {
		return str.substring(str.length() - 2, str.length()) + str.substring(str.length() - 2, str.length())
				+ str.substring(str.length() - 2, str.length());
	}
}
