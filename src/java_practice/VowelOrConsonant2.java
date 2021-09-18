package java_practice;

import java.util.Scanner;

public class VowelOrConsonant2 {

	public static void main(String[] args) {
		char ch;
		String str;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the alphabet: ");
		str = input.next().toLowerCase();
		ch = str.charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println("Vowel");
		else 
			System.out.println("Consonant");
	
		input.close();
	}

}
