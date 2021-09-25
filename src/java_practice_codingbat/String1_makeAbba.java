package java_practice_codingbat;

import java.util.Scanner;

//Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

public class String1_makeAbba {

	public static void main(String[] args) {
		String a, b;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string a: ");
		a = input.nextLine();
		System.out.print("Enter string b: ");
		b = input.nextLine();
		System.out.println(makeAbba(a, b));

		input.close();
	}

	public static String makeAbba(String a, String b) {
		return a + b + b + a;
	}
}
