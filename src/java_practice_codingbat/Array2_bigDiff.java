package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Given an array length 1 or more of integers, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
		
public class Array2_bigDiff {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println("array is " + Arrays.toString(nums));
		System.out.println(bigDiff(nums));
		
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

	public static int bigDiff(int[] nums) {
		  int largest = nums[0], smallest = nums[0];
		  for(int i=1;i<nums.length;i++){
		    largest = Math.max(largest,nums[i]);
		    smallest = Math.min(smallest,nums[i]);
		  }
		  int bigDiff = largest-smallest;
		  return bigDiff;
		}

}
