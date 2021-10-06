package java_practice_codingbat;

import java.util.Scanner;

//Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

public class String2_repeatSeparator {

	public static void main(String[] args) {
		String word, sep;
		int count;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter word: ");
		word = input.nextLine();
		System.out.print("Enter separator: ");
		sep = input.nextLine();
		System.out.print("Enter count: ");
		count = input.nextInt();
		System.out.println(repeatSeparator(word, sep, count));

		input.close();
	}

	public static String repeatSeparator(String word, String sep, int count) {
		String newWord = "";
		for (int i = 0; i < count; i++) {
			newWord += word + sep;
		}
		int newWordLength = word.length() * count + sep.length() * (count - 1);
		return newWord.substring(0, newWordLength);
	}
}

//Other methods: 
//-->	public static String repeatSeparator(String word, String sep, int count) {
//	  String newWord = "";
//	  for (int i = 0; i < count; i++) {
//	    if (i < count-1)
//	      newWord += word + sep;
//	    else
//	      newWord += word;
//	  }
//	  return newWord;
//	}

