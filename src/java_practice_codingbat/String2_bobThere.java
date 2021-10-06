package java_practice_codingbat;

import java.util.Scanner;

//Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

public class String2_bobThere {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(bobThere(str));

		input.close();
	}

	public static boolean bobThere(String str) {
		return str.matches("(.*)b(\\w)b(.*)");
	}
}
