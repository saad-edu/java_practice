package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.

public class Warmup1_endUp {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = input.nextLine();
		System.out.println(endUp(str));

		input.close();
	}

	public static String endUp(String str) {
		if (str.length() < 3)
			return str.toUpperCase();
		else
			return str.substring(0, str.length() - 3) + str.substring(str.length() - 3, str.length()).toUpperCase();
	}
}
