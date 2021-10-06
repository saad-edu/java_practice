package java_practice_codingbat;

import java.util.Scanner;

//Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().

public class String2_prefixAgain {

	public static void main(String[] args) {
		String str;
		int n;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string a: ");
		str = input.nextLine();
		System.out.print("Enter n: ");
		n = input.nextInt();
		System.out.println(prefixAgain(str, n));

		input.close();
	}

	public static boolean prefixAgain(String str, int n) {
		return str.substring(n).contains(str.substring(0, n));
	}

}
