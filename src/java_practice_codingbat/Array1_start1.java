package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Start with 2 integer arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.

public class Array1_start1 {

	public static void main(String[] args) {
		int[] a, b;
		a = getArray();
		System.out.println("First array is " + Arrays.toString(a));
		b = getArray();
		System.out.println("Second array is " + Arrays.toString(b));
		System.out.println(start1(a, b));

	}

	public static int[] getArray() {
		int arraySize;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		arraySize = input.nextInt();
		int[] nums = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			System.out.print("Enter array element " + (i + 1) + ": ");
			nums[i] = input.nextInt();
		}

		input.close();
		return nums;

	}

	public static int start1(int[] a, int[] b) {
		int count = 0;
		if (a.length > 0 && a[0] == 1)
			count++;
		if (b.length > 0 && b[0] == 1)
			count++;
		return count;
	}

}
