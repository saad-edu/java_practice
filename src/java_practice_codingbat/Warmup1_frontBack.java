package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return a new string where the first and last chars have been exchanged.

public class Warmup1_frontBack {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the string: ");
		str = input.next();
		System.out.println(frontBack(str));

		input.close();
	}

	public static String frontBack(String str) {
		if (str.length() <= 1)
			return str;
		else {
			return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
		}
	}
}
