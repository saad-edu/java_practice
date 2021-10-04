package java_practice_codingbat;

import java.util.Scanner;

//Given 2 arrays of integers, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.

public class Array1_commonEnd {

	public static void main(String[] args) {
		int[] a;
		a = getArray();
		int[] b;
		b = getArray();
		System.out.println(commonEnd(a, b));

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

	public static boolean commonEnd(int[] a, int[] b) {
		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1])
			return true;
		else
			return false;
	}
}
