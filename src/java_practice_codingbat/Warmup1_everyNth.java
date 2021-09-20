package java_practice_codingbat;

import java.util.Scanner;

//Given a non-empty string and an integer N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

public class Warmup1_everyNth {

	public static void main(String[] args) {
		String str;
		int n;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = input.next();
		System.out.print("Enter n value: ");
		n = input.nextInt();
		System.out.println(everyNth(str, n));

		input.close();
	}

	public static String everyNth(String str, int n) {
		String newStr = "";
		for (int i = 0; i < str.length(); i += n)
			newStr += str.charAt(i);
		return newStr;
	}

}
