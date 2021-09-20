package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return true if the string starts with "hi" and false otherwise.

public class Warmup1_startHi {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the string: ");
		str = input.nextLine();
		System.out.println(startHi(str));

		input.close();
	}

	public static boolean startHi(String str) {
		if (str.length() >= 2 && str.substring(0, 2).equals("hi"))
			return true;
		else
			return false;
	}
}
