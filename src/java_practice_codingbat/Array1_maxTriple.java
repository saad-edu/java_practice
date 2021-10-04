package java_practice_codingbat;

import java.util.Scanner;

//Given an array of integers of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.

public class Array1_maxTriple {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println(maxTriple(nums));

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

	public static int maxTriple(int[] nums) {
		return nums[0] > nums[nums.length / 2] ? (nums[0] > nums[nums.length - 1] ? nums[0] : nums[nums.length - 1])
				: (nums[nums.length / 2] > nums[nums.length - 1] ? nums[nums.length / 2] : nums[nums.length - 1]);
	}
}
