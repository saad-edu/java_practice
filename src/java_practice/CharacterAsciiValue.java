package java_practice;

import java.util.Scanner;

public class CharacterAsciiValue {

	public static void main(String[] args) {
		String str;
		char ch;
		int ascii, castAscii;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the character: ");
		str = input.next();
		ch = str.charAt(0);
		ascii = ch;
		castAscii = (int) ch;
		System.out.println("The ASCII value by implicit type casting: " + ascii);
		System.out.println("The ASCII value by explicit type casting: " + castAscii);
		
		input.close();
	}

}
