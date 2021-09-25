package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.

public class String1_atFirst {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(atFirst(str));

		input.close();
	}

	public static String atFirst(String str) {
		if (str.length() >= 2)
			return str.substring(0, 2);
		else if (str.length() == 1)
			return str + "@";
		else
			return "@@";
	}

}
