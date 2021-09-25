package java_practice_codingbat;

import java.util.Scanner;

//Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

public class String1_minCat {

	public static void main(String[] args) {
		String a, b;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string a: ");
		a = input.nextLine();
		System.out.print("Enter string b: ");
		b = input.nextLine();
		System.out.println(minCat(a, b));

		input.close();
	}

	public static String minCat(String a, String b) {
		int aLen = a.length(), bLen = b.length(), lenDiff = Math.abs(aLen - bLen);
		if (aLen > bLen)
			a = a.substring(lenDiff);
		else if (bLen > aLen)
			b = b.substring(lenDiff);
		return a + b;
	}

}
