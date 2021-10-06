package java_practice_codingbat;

import java.util.Scanner;

//Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

public class String2_endOther {

	public static void main(String[] args) {
		String a, b;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string a: ");
		a = input.nextLine();
		System.out.print("Enter string b: ");
		b = input.nextLine();
		System.out.println(endOther(a, b));

		input.close();
	}

	public static boolean endOther(String a, String b) {
		return a.length() >= b.length() ? a.toLowerCase().endsWith(b.toLowerCase())
				: b.toLowerCase().endsWith(a.toLowerCase());
	}
}
