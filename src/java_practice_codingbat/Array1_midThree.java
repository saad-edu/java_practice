package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Given an array of integers of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.

public class Array1_midThree {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println(Arrays.toString(midThree(nums)));

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

	public static int[] midThree(int[] nums) {
		return new int[] { nums[(nums.length - 1) / 2 - 1], nums[(nums.length - 1) / 2],
				nums[(nums.length - 1) / 2 + 1] };
	}

}
