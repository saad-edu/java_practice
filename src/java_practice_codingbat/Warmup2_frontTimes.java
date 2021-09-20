package java_practice_codingbat;

import java.util.Scanner;

//Given a string and a non-negative integer n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;

public class Warmup2_frontTimes {

	public static void main(String[] args) {
		String str;
		int n;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = input.nextLine();
		System.out.print("Enter n times to repeat: ");
		n = input.nextInt();
		System.out.println(frontTimes(str, n));

		input.close();
	}

	public static String frontTimes(String str, int n) {
		String front, newStr = "";
		if (str.length() < 3)
			front = str;
		else
			front = str.substring(0, 3);
		for (int i = 1; i <= n; i++)
			newStr += front;
		return newStr;
	}

}
