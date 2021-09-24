package java_practice_codingbat;

import java.util.Scanner;

//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

public class String1_helloName {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter name: ");
		str = input.nextLine();
		System.out.println(helloName(str));

		input.close();
	}

	public static String helloName(String name) {
		return "Hello " + name + "!";
	}
}
