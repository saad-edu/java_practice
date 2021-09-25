package java_practice_codingbat;

import java.util.Scanner;

//Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".

public class String1_lastTwo {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = input.nextLine();
		System.out.println(lastTwo(str));

		input.close();
	}

	public static String lastTwo(String str) {
		if (str.length() < 2)
			return str;
		else
			return str.substring(0, str.length() - 2) + str.substring(str.length() - 1)
					+ str.substring(str.length() - 2, str.length() - 1);
	}
}
