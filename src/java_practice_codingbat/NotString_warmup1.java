package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

public class NotString_warmup1 {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the string: ");
		str = input.nextLine();
		System.out.println(notString(str));

		input.close();
	}

	public static String notString(String str) {
		if (str.length() >= 3 && str.substring(0, 3).equals("not"))
			return str;
		else
			return "not " + str;

	}

}
