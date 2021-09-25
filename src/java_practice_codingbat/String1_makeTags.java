package java_practice_codingbat;

import java.util.Scanner;

//The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

public class String1_makeTags {

	public static void main(String[] args) {
		String a, b;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter tag: ");
		a = input.nextLine();
		System.out.print("Enter word: ");
		b = input.nextLine();
		System.out.println(makeTags(a, b));

		input.close();
	}

	public static String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}
}
