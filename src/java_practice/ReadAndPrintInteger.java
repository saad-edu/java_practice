package java_practice;

import java.util.Scanner;

public class ReadAndPrintInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		System.out.println("input number is "+ number);
		input.close();
	}

}
