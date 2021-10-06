package java_practice_codingbat;

import java.util.Scanner;

//Given a string and an integer n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.

public class String2_repeatEnd {

	public static void main(String[] args) {
		String str;
		int n;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string a: ");
		str = input.nextLine();
		System.out.print("Enter n: ");
		n = input.nextInt();
		System.out.println(repeatEnd(str, n));

		input.close();
	}

	public static String repeatEnd(String str, int n) {
		String newStr = "";
		for (int i = 0; i < n; i++)
			newStr += str.substring(str.length() - n);
		return newStr;
	}
}
