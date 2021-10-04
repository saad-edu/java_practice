package java_practice_codingbat;

import java.util.Scanner;

//Given an array of integers, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.

public class Array1_sum2 {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println(sum2(nums));

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

	public static int sum2(int[] nums) {
		if (nums.length == 0)
			return 0;
		else {
			int sum = nums.length == 1 ? nums[0] : nums[0] + nums[1];
			return sum;
		}

	}

}
