package java_practice_codingbat;

import java.util.Scanner;

//Given an array of integers, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

public class Array1_firstLast6 {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println(firstLast6(nums));

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

	public static boolean firstLast6(int[] nums) {
		if (nums[0] == 6 || nums[nums.length - 1] == 6)
			return true;
		else
			return false;
	}
}
