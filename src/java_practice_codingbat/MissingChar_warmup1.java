package java_practice_codingbat;

import java.util.Scanner;

//Given a non-empty string and an integer n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

public class MissingChar_warmup1 {

	public static void main(String[] args) {
		String str;
		int n;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the string: ");
		str = input.nextLine();
		System.out.print("Enter valid char index in range 0..string_length-1 inclusive: ");
		n = input.nextInt();
		System.out.println(missingChar(str, n));

		input.close();
	}

	public static String missingChar(String str, int n) {
		if (n >= str.length())
			return "Char index out of bounds. Enter valid input";
		else
			return str.substring(0, n) + str.substring(n + 1, str.length());
	}

}
