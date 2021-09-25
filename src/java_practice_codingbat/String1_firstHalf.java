package java_practice_codingbat;

import java.util.Scanner;

//Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

public class String1_firstHalf {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(firstHalf(str));

		input.close();
	}

	public static String firstHalf(String str) {
		return str.substring(0, (str.length() / 2));
	}
}
