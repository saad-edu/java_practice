package java_practice_codingbat;

import java.util.Scanner;

//Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

public class String2_sameStarChar {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(sameStarChar(str));

		input.close();
	}

	public static boolean sameStarChar(String str) {
		boolean temp = true;
		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
				temp = false;
				break;
			} else
				continue;
		}
		return temp;
	}

}
