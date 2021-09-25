package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return true if it ends in "ly".

public class String1_endsLy {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(endsLy(str));

		input.close();
	}

	public static boolean endsLy(String str) {
		if (str.length() < 2)
			return false;
		return str.substring(str.length() - 2, str.length()).equals("ly") ? true : false;
	}

}
