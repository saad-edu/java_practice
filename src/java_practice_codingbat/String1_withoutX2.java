package java_practice_codingbat;

import java.util.Scanner;

//Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.

public class String1_withoutX2 {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(withoutX2(str));

		input.close();
	}

	public static String withoutX2(String str) {
		String newStr = str;
		if (str.startsWith("x"))
			newStr = str.substring(1);
		if (str.startsWith("x") && str.length() >= 2 && str.charAt(1) == 'x')
			newStr = newStr.substring(1);
		if (!str.startsWith("x") && str.length() >= 2 && str.charAt(1) == 'x')
			newStr = str.substring(0, 1) + str.substring(2);
		return newStr;
	}

}
