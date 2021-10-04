package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Given an array of integers, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.

public class Array1_makeEnds {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println(Arrays.toString(makeEnds(nums)));

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

	public static int[] makeEnds(int[] nums) {
		return new int[] { nums[0], nums[nums.length - 1] };
	}
}
