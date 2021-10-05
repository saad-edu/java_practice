package java_practice_codingbat;

import java.util.Scanner;

//Return the number of times that the string "hi" appears anywhere in the given string.

public class String2_countHi {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(countHi(str));

		input.close();
	}

	public static int countHi(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++)
			if (str.substring(i, i + 2).equals("hi"))
				count++;
		return count;
	}

}
