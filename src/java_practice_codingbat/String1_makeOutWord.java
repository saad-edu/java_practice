package java_practice_codingbat;

import java.util.Scanner;

//Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

public class String1_makeOutWord {

	public static void main(String[] args) {
		String a, b;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter out: ");
		a = input.nextLine();
		System.out.print("Enter word: ");
		b = input.nextLine();
		System.out.println(makeOutWord(a, b));

		input.close();
	}

	public static String makeOutWord(String out, String word) {
		return out.substring(0, 2) + word + out.substring(2, 4);
	}

}
