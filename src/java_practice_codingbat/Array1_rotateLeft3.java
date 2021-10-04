package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Given an array of integers length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

public class Array1_rotateLeft3 {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println(Arrays.toString(rotateLeft3(nums)));

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

	public static int[] rotateLeft3(int[] nums) {
		int temp;
		temp = nums[0];
		for (int i = 0; i < nums.length - 1; i++)
			nums[i] = nums[i + 1];
		nums[nums.length - 1] = temp;
		return nums;

	}
}
