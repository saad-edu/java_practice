package java_practice_codingbat;

import java.util.Scanner;

//Given an array of integers length 3, return the sum of all the elements.

public class Array1_sum3 {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println(sum3(nums));

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

	public static int sum3(int[] nums) {
		int sum = 0;
		for (int num : nums)
			sum += num;
		return sum;
	}
}
