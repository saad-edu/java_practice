package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Given an array of integers length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.

public class Array1_maxEnd3 {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println(Arrays.toString(maxEnd3(nums)));

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

	public static int[] maxEnd3(int[] nums) {
		int largest = nums[0] > nums[nums.length - 1] ? nums[0] : nums[nums.length - 1];
		return new int[] { largest, largest, largest };
	}

}
