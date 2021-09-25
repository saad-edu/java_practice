package java_practice_codingbat;

import java.util.Scanner;

//Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

public class String1_seeColor {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter color string: ");
		str = input.nextLine();
		System.out.println(seeColor(str));

		input.close();
	}

	public static String seeColor(String str) {
		if (str.length() >= 3 && str.substring(0, 3).equals("red"))
			return "red";
		else if (str.length() >= 4 && str.substring(0, 4).equals("blue"))
			return "blue";
		else
			return "";
	}

}
