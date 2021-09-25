package java_practice_codingbat;

import java.util.Scanner;

//Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.

public class String1_startWord {

	public static void main(String[] args) {
		String str, word;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.print("Enter word: ");
		word = input.nextLine();
		System.out.println(startWord(str, word));

		input.close();
	}

	public static String startWord(String str, String word) {
		int wordLen = word.length(), strLen = str.length();
		String newStr = "";
		if (strLen >= wordLen && wordLen >= 1 && str.substring(1, wordLen).equals(word.substring(1)))
			newStr += str.substring(0, 1);
		if (strLen >= wordLen && wordLen >= 2 && str.substring(1, wordLen).equals(word.substring(1)))
			newStr += str.substring(1, wordLen);
		return newStr;
	}

}
