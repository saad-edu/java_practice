package java_practice_codingbat;

import java.util.Scanner;

//Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

public class MixStart_warmup1 {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the string: ");
		str = input.nextLine();
		System.out.println(mixStart(str));

		input.close();
	}

	public static boolean mixStart(String str) {
		if (str.length() >= 3 && str.substring(1, 3).equals("ix"))
			return true;
		else
			return false;
	}

}
