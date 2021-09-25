package java_practice_codingbat;

import java.util.Scanner;

//Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.

public class String1_middleThree {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(middleThree(str));

		input.close();
	}

	public static String middleThree(String str) {
		return str.substring(((str.length() - 1) / 2) - 1, ((str.length() - 1) / 2) + 2);
	}

}
