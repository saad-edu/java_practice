package java_practice_codingbat;

import java.util.Scanner;

//A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

public class String2_getSandwich {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(getSandwich(str));

		input.close();
	}

	public static String getSandwich(String str) {
		int first = str.indexOf("bread"), last = str.lastIndexOf("bread");
		if (first == last || !str.contains("bread"))
			return "";
		return str.substring(first + 5, last);
	}
}
