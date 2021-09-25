package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.

public class String1_firstTwo {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(firstTwo(str));

		input.close();
	}

	public static String firstTwo(String str) {
		if (str.length() < 2)
			return str;
		else
			return str.substring(0, 2);
	}
}
