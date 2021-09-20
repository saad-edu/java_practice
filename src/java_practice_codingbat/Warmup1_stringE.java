package java_practice_codingbat;

import java.util.Scanner;

//Return true if the given string contains between 1 and 3 'e' chars.

public class Warmup1_stringE {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = input.next();
		System.out.println(stringE(str));

		input.close();
	}

	public static boolean stringE(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e')
				count++;
			if (count > 3)
				break;
		}

		if (count >= 1 && count <= 3)
			return true;
		else
			return false;
	}
}
