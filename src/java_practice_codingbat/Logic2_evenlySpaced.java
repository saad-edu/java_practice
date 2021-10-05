package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Given three integers, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

public class Logic2_evenlySpaced {

	public static void main(String[] args) {
		int a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = input.nextInt();
		System.out.print("Enter b : ");
		b = input.nextInt();
		System.out.print("Enter c : ");
		c = input.nextInt();
		System.out.println(evenlySpaced(a, b, c));

		input.close();
	}

	public static boolean evenlySpaced(int a, int b, int c) {
		int[] arr = { a, b, c };
		Arrays.sort(arr);
		return arr[1] - arr[0] == arr[2] - arr[1];
	}
}
