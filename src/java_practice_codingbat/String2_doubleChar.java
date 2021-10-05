package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return a string where for every char in the original, there are two chars.

public class String2_doubleChar {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(doubleChar(str));

		input.close();
	}

	public static String doubleChar(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++)
			newStr += str.substring(i, i + 1) + str.substring(i, i + 1);
		return newStr;
	}

}
