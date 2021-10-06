package java_practice_codingbat;

import java.util.Scanner;

//Given a string and an integer n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

public class String2_repeatFront {

	public static void main(String[] args) {
		String str;
		int n;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string a: ");
		str = input.nextLine();
		System.out.print("Enter n: ");
		n = input.nextInt();
		System.out.println(repeatFront(str, n));

		input.close();
	}

	public static String repeatFront(String str, int n) {
		String newStr = "";
		for (int i = 0; i < n; i++)
			newStr += str.substring(0, n - i);
		return newStr;
	}
}

//	Other way of looping:
//	  for (int i = n; n > 0; n--){
//	    newWord += str.substring(0,n);
//	  }

