package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

public class String1_deFront {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(deFront(str));

		input.close();
	}

	public static String deFront(String str) {   
		  String newStr = "";
		  if(str.length()>=1 && str.charAt(0) == 'a') newStr += str.substring(0,1);
		  if(str.length()>=2 && str.charAt(1) == 'b') newStr += str.substring(1,2);
		  if(str.length()>2) newStr += str.substring(2);
		  return newStr;
		}
}
