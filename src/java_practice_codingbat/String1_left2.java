package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.

public class String1_left2 {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(left2(str));

		input.close();
	}

	public static String left2(String str) {
		return str.substring(2, str.length()) + str.substring(0, 2);
	}

}
