package java_practice;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		char ch;
		String str;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the alphabet: ");
		str = input.next().toLowerCase();
		ch = str.charAt(0);
		switch(ch){
			case 'a': 
			case 'e': 
			case 'i': 
			case 'o': 
			case 'u': System.out.println("Vowel"); break;
			default: System.out.println("Consonant");
		}
		input.close();
	}

}
