package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Given 2 integer arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.

public class Array1_front11 {

	public static void main(String[] args) {
		int[] a, b;
		a = getArray();
		System.out.println("First array: " + Arrays.toString(a));
		b = getArray();
		System.out.println("Second array: " + Arrays.toString(b));
		System.out.println(Arrays.toString(front11(a, b)));

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

	public static int[] front11(int[] a, int[] b) {
		if (a.length == 0 && b.length == 0)
			return a;
		else if (a.length == 0)
			return new int[] { b[0] };
		else if (b.length == 0)
			return new int[] { a[0] };
		else
			return new int[] { a[0], b[0] };
	}

}
