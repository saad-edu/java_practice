package java_practice_codingbat;

import java.util.Scanner;

//Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

public class Warmup1_backAround {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string with atleast one character: ");
		str = input.next();
		System.out.println(backAround(str));

		input.close();
	}

	public static String backAround(String str) {
		  return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
		}
}
