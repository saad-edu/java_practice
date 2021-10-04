package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Given an array of integers of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.

public class Array1_makeMiddle {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println(Arrays.toString(makeMiddle(nums)));

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

	public static int[] makeMiddle(int[] nums) {
		return new int[] { nums[(nums.length / 2) - 1], nums[nums.length / 2] };
	}
}
