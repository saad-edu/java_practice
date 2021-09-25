package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.

public class String1_right2 {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(right2(str));

		input.close();
	}

	public static String right2(String str) {
		return str.substring(str.length() - 2, str.length()) + str.substring(0, str.length() - 2);
	}

}
