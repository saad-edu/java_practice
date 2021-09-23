package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

public class Warmup2_altPairs {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = input.nextLine();
		System.out.println(altPairs(str));

		input.close();
	}

	public static String altPairs(String str) {
		String newStr = "";
		if (str.length() < 2)
			return str;
		for (int i = 0; i < str.length(); i += 4) {
			if (i == str.length() - 1)
				newStr += str.charAt(i);
			else
				newStr += str.substring(i, i + 2);
		}
		return newStr;
	}
}
