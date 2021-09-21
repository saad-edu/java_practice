package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

public class Warmup2_stringBits {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = input.nextLine();
		System.out.println(stringBits(str));

		input.close();
	}

	public static String stringBits(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i += 2)
			newStr += str.charAt(i);
		return newStr;
	}

}
