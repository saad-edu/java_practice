package java_practice_codingbat;

import java.util.Scanner;

//Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.

public class Warmup1_delDel {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the string: ");
		str = input.next();
		System.out.println(delDel(str));

		input.close();
	}

	public static String delDel(String str) {
		if (str.length() >= 4 && str.substring(1, 4).equals("del"))
			return str.charAt(0) + str.substring(4, str.length());
		else
			return str;
	}
}
