package java_practice_codingbat;

import java.util.Scanner;

//Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.

public class Logic1_fizzString {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string : ");
		str = input.nextLine();
		System.out.println(fizzString(str));

		input.close();
	}

	public static String fizzString(String str) {
		if (str.toLowerCase().startsWith("f") && str.toLowerCase().endsWith("b"))
			return "FizzBuzz";
		else if (str.toLowerCase().startsWith("f"))
			return "Fizz";
		else if (str.toLowerCase().endsWith("b"))
			return "Buzz";
		else
			return str;

	}

}
