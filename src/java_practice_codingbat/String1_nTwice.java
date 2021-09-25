package java_practice_codingbat;

import java.util.Scanner;

//Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.

public class String1_nTwice {

	public static void main(String[] args) {
		String str;
		int n;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.print("Enter n: ");
		n = input.nextInt();
		System.out.println(nTwice(str,n));

		input.close();
	}

	public static String nTwice(String str, int n) {
		return str.substring(0, n) + str.substring(str.length() - n, str.length());
	}

}
