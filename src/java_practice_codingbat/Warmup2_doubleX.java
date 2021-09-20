package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

public class Warmup2_doubleX {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = input.next();
		System.out.println(doubleX(str));

		input.close();
	}

	public static boolean doubleX(String str) {
		int n = str.toLowerCase().indexOf('x');
		if (n == -1)
			return false;
		else if (n == str.length() - 1)
			return false;
		else
			return str.toLowerCase().charAt(n + 1) == 'x' ? true : false;
	}

}
