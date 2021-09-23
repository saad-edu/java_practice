package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

public class Warmup2_stringX {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = input.nextLine();
		System.out.println(stringX(str));

		input.close();
	}

	public static String stringX(String str) {
		String newStr = "";
		if (str.length() < 2)
			return str;
		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'x')
				continue;
			else
				newStr += str.charAt(i);
		}
		return str.charAt(0) + newStr + str.charAt(str.length() - 1);
	}
}
