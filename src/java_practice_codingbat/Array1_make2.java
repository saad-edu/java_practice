package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Given 2 integer arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.

public class Array1_make2 {

	public static void main(String[] args) {
		int[] a, b;
		a = getArray();
		System.out.println("First array: " + Arrays.toString(a));
		b = getArray();
		System.out.println("Second array: " + Arrays.toString(b));
		System.out.println(Arrays.toString(make2(a, b)));

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

	public static int[] make2(int[] a, int[] b) {
		if (a.length == 0)
			return new int[] { b[0], b[1] };
		else if (a.length == 1)
			return new int[] { a[0], b[0] };
		else
			return new int[] { a[0], a[1] };
	}

}
