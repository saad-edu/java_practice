package java_practice_codingbat;

import java.util.Scanner;

//Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

public class Warmup2_stringMatch {

	public static void main(String[] args) {
		String a, b;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first string: ");
		a = input.nextLine();
		System.out.print("Enter second string: ");
		b = input.nextLine();
		System.out.println(stringMatch(a, b));

		input.close();
	}

	public static int stringMatch(String a, String b) {
		  String aSub, bSub;
		  int count = 0;
		  for (int i = 0; i < a.length()-1 && i < b.length()-1; i++) {
		    aSub = a.substring(i, i+2);
		    bSub = b.substring(i, i+2);
		    if (aSub.equals(bSub)) count++;
		  }
		  return count;
	}
}
