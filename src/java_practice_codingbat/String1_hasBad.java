package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.

public class String1_hasBad {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(hasBad(str));

		input.close();
	}

	public static boolean hasBad(String str) {
		if (str.length() < 3)
			return false;
		else
			return str.length() >= 3 && str.substring(0, 3).equals("bad")
					|| str.length() > 3 && str.substring(1, 4).equals("bad");
	}

}
