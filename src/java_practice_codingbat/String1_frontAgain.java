package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".

public class String1_frontAgain {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = input.nextLine();
		System.out.println(frontAgain(str));

		input.close();
	}

	public static boolean frontAgain(String str) {
		if (str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2)))
			return true;
		else
			return false;
	}

}
