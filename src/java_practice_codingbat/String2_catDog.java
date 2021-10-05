package java_practice_codingbat;

import java.util.Scanner;

//Return true if the string "cat" and "dog" appear the same number of times in the given string.

public class String2_catDog {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(catDog(str));

		input.close();
	}

	public static boolean catDog(String str) {
		int cat = 0, dog = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("cat"))
				cat++;
			if (str.substring(i, i + 3).equals("dog"))
				dog++;
		}
		return cat == dog;
	}
}
