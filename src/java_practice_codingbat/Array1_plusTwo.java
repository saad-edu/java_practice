package java_practice_codingbat;

import java.util.Arrays;

import java.util.Scanner;

//Given 2 integer arrays, each length 2, return a new array length 4 containing all their elements.

public class Array1_plusTwo {

	public static void main(String[] args) {
		int[] a, b;
		a = getArray();
		System.out.println("First array is " + Arrays.toString(a));
		b = getArray();
		System.out.println("Second array is " + Arrays.toString(b));
		System.out.println(Arrays.toString(plusTwo(a, b)));

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

	public static int[] plusTwo(int[] a, int[] b) {
		return new int[] { a[0], a[1], b[0], b[1] };
	}

}
