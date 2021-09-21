package java_practice_codingbat;

import java.util.Scanner;

//Given a non-empty string like "Code" return a string like "CCoCodCode".

public class Warmup2_stringSplosion {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = input.nextLine();
		System.out.println(stringSplosion(str));

		input.close();
	}

	public static String stringSplosion(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++)
			newStr += str.substring(0, i + 1);
		return newStr;
	}

}
