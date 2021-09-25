package java_practice_codingbat;

import java.util.Scanner;

//Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.

public class String1_twoChar {

	public static void main(String[] args) {
		String str;
		int n;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.print("Enter n: ");
		n = input.nextInt();
		System.out.println(twoChar(str, n));

		input.close();
	}

	public static String twoChar(String str, int index) {
		if (str.length() - index <= 1 || index < 0)
			return str.substring(0, 2);
		else
			return str.substring(index, index + 2);
	}

}
