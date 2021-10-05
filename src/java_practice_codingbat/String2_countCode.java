package java_practice_codingbat;

import java.util.Scanner;

//Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

public class String2_countCode {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(countCode(str));

		input.close();
	}

	public static int countCode(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 3; i++)
			if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e')
				count++;
		return count;
	}

}
