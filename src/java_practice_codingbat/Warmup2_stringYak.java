package java_practice_codingbat;

import java.util.Scanner;

//Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.

public class Warmup2_stringYak {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = input.nextLine();
		System.out.println(stringYak(str));

		input.close();
	}

	public static String stringYak(String str) {
		   return str.replace("yak","");
		}
}
