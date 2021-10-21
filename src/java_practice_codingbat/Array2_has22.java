package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Given an array of integers, return true if the array contains a 2 next to a 2 somewhere.

public class Array2_has22 {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println("array is " + Arrays.toString(nums));
		System.out.println(has22(nums));

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

	public static boolean has22(int[] nums) {

		  for (int i=0; i<nums.length-1 ;i++)
		  if (nums[i]==2 && nums[i+1]==2) return true;

		  return false;
		}

}

