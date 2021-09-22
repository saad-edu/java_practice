package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

public class Warmup2_last2 {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = input.nextLine();
		System.out.println(last2(str));

		input.close();
	}

	public static int last2(String str) {
		int count = 0;
		if (str.length() < 2)
			return count;
		else {
			String subStr = str.substring(str.length() - 2, str.length());
			for (int i = 0; i <= str.length() - 3; i++) {
				if (str.toLowerCase().substring(i, i + 2).equals(subStr))
					count++;
			}
			return count;
		}
	}
}
