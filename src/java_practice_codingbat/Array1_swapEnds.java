package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Given an array of integers, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.

public class Array1_swapEnds {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println(Arrays.toString(swapEnds(nums)));

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

	public static int[] swapEnds(int[] nums) {
		int temp = nums[nums.length - 1];
		nums[nums.length - 1] = nums[0];
		nums[0] = temp;
		return nums;
	}

}
