package java_practice_codingbat;

import java.util.Scanner;

//Given an array of integers, return true if the array is length 1 or more, and the first element and the last element are equal.

public class Array1_sameFirstLast {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println(sameFirstLast(nums));

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

	public static boolean sameFirstLast(int[] nums) {
		if (nums.length >= 1 && nums[0] == nums[nums.length - 1])
			return true;
		else
			return false;
	}
}
