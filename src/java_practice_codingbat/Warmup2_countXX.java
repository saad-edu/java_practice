package java_practice_codingbat;

import java.util.Scanner;

//Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

public class Warmup2_countXX {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = input.nextLine();
		System.out.println(countXX(str));

		input.close();
	}

	public static int countXX(String str) {
		int count = 0;
		if (str.length() < 2)
			return count;
		else {
			for (int i = 0; i < str.length() - 1; i++) {
				if (str.toLowerCase().substring(i, i + 2).equals("xx")) count++;
			}		
			return count;
		}
	}
}
