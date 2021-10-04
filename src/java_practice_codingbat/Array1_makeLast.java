package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Given an integer array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.

public class Array1_makeLast {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println(Arrays.toString(makeLast(nums)));

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

	public static int[] makeLast(int[] nums) {
		int[] newNums = new int[nums.length * 2];
		newNums[newNums.length - 1] = nums[nums.length - 1];
		return newNums;
	}

}
