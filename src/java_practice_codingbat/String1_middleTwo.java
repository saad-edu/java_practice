package java_practice_codingbat;

import java.util.Scanner;

//Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.

public class String1_middleTwo {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(middleTwo(str));

		input.close();
	}

	public static String middleTwo(String str) {
		return str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
	}

}
